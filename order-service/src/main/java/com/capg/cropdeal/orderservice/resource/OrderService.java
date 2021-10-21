package com.capg.cropdeal.orderservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capg.cropdeal.orderservice.model.Orders;
import com.capg.cropdeal.orderservice.repository.OrderRepository;

@Component
public class OrderService {

	@Autowired
	private OrderRepository repository;

	public String orderProduct(Orders order) {
		repository.save(order);
		return "Order placed";
	}

}
