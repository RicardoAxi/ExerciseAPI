package com.example.demo.service;

import java.util.List;

import com.example.demo.commons.OrderTO;

public interface OrderService {

	
	List<OrderTO> getAllOrders();
	OrderTO getOrderById(Long id);
	Long createOrder(OrderTO order);
	void editOrder(OrderTO order, Long id);
	void delete(Long id);
}
