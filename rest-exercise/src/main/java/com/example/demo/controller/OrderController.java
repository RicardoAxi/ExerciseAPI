package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.commons.OrderTO;
import com.example.demo.service.OrderService;

@RestController
@RequestMapping("order")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@GetMapping(path = "", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<OrderTO>> getAllOrders(){
		List<OrderTO> orders = orderService.getAllOrders();
		return new ResponseEntity<>(orders, HttpStatus.OK);
	}
	
	@GetMapping(path = "/{id}",produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<OrderTO> getOrder(@PathVariable("id")Long id){
		OrderTO order = orderService.getOrderById(id);
		return ResponseEntity.ok(order);
	}
	
	@PostMapping(path = " ", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<OrderTO> createOrder(@RequestBody OrderTO request){
		orderService.createOrder(request);
		return ResponseEntity.ok(request);
	}
	
	@DeleteMapping(value = "/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	 public ResponseEntity<?> deleteProductos(@PathVariable("id") Long id) {
		orderService.delete(id);
		return new ResponseEntity<>(true, HttpStatus.OK);
		
	}

	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<OrderTO> updateOrder(@PathVariable("id") Long id, @RequestBody OrderTO request){
		orderService.editOrder(request, id);
		return ResponseEntity.ok(request);
	}

}
