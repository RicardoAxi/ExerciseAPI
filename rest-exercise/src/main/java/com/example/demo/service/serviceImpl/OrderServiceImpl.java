package com.example.demo.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.commons.OrderDetailTO;
import com.example.demo.commons.OrderTO;
import com.example.demo.entity.OrderDO;
import com.example.demo.entity.OrderDetailDO;
import com.example.demo.persistance.OrderDAO;
import com.example.demo.persistance.OrderDetailDAO;
import com.example.demo.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDAO orderDAO;
	@Autowired
	private OrderDetailDAO orderDetailDAO;
	@Override
	public List<OrderTO> getAllOrders() {
		List<OrderTO> response =new ArrayList<>();
		List<OrderDO> orderDO = orderDAO.findAll();
		for (OrderDO orderDO2 : orderDO) {
			response.add(convert(orderDO2));
		}
		
		return response;
	}

	@Override
	public OrderTO getOrderById(Long id) {
		OrderTO response = null;
		OrderDO responseDo = orderDAO.findById(id).get();
		response = convert(responseDo);
		return response;
	}

	private OrderTO convert(OrderDO responseDo) {
		OrderTO response;
		response = castingDOtoTO(responseDo);
		List<OrderDetailDO> details = orderDetailDAO.findDetailsByOrderId(responseDo.getId());
		final List<OrderDetailTO> list = new ArrayList<>();
		details.stream().forEach(orderDetailDO ->{
			list.add(castDetailDOtoTO(orderDetailDO));} );

		response.setDetails(list);
		return response;
	}

	@Override
	public Long createOrder(OrderTO order) {
		OrderDO orderDO = orderTOtoorderDO(order);
		orderDO.setId(null);
		orderDAO.save(orderDO);
		orderDAO.flush();
		
		List<OrderDetailDO> detalles = new ArrayList<OrderDetailDO>();
		order.getDetails().forEach(e -> {
			detalles.add(OrderDetailcastTOtoDO(e,orderDO));
		});
		
		orderDetailDAO.saveAll(detalles);
		orderDetailDAO.flush();
		
	
		return orderDO.getId();
	}

	@Override
	public void editOrder(OrderTO order, Long id) {

		OrderDO orderDO = orderTOtoorderDO(order);
		orderDO.setId(orderDAO.findById(id).get().getId());

		orderDAO.save(orderDO);
		orderDAO.flush();
		
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		OrderDO todelete = orderDAO.findById(id).get();
		orderDAO.delete(todelete);

	}

	private OrderTO castingDOtoTO(OrderDO order) {
		
		OrderTO response = new OrderTO(order.getId(),order.getClientId(),
				order.getTs(),order.getTotal(), new ArrayList<>());
		return response;
	}
	
	private OrderDetailTO castDetailDOtoTO(OrderDetailDO e) {
		OrderDetailTO response = new OrderDetailTO(e.getId(), e.getOrder().getId(), 
				e.getSku(),e.getDescription(),e.getQuantity(),e.getPrice());
		return response;
	}

	private OrderDO orderTOtoorderDO(OrderTO inOrder){
		OrderDO response = new OrderDO();
		response.setId(inOrder.getId());
		response.setClientId(inOrder.getClientId());
		response.setTs(inOrder.getTimestamp());
		response.setTotal(inOrder.getTotal());
		response.setDetails(orderDetailDAO.findDetailsByOrderId(inOrder.getId()));
		return response;
	}
	
	private OrderDetailDO OrderDetailcastTOtoDO(OrderDetailTO e, OrderDO order) {
		OrderDetailDO response = new OrderDetailDO();
		response.setId(e.getId());
		response.setSku(e.getSku());
		response.setDescription(e.getDescription());
		response.setQuantity(e.getQuantity());
		response.setPrice(e.getPrice());
		response.setOrder(orderDAO.findById(order.getId()).get());
		
		return response;
		
	}

}
