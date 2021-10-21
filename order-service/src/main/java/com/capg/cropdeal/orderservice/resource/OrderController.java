package com.capg.cropdeal.orderservice.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.cropdeal.orderservice.model.Orders;
import com.capg.cropdeal.orderservice.repository.OrderRepository;

@RestController
public class OrderController {

	@Autowired
	private OrderRepository repository;
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/orderProduct")
	public String orderProduct(@RequestBody Orders order) {
		return orderService.orderProduct(order);
	}
	
	@GetMapping("/allOrders")
	public List<Orders> findAllOrders(){
		return repository.findAll();
	}
	
	@GetMapping(value= "/allOrdersBySeller/{sellerName}")
	public Optional<Orders> findOrdersBySeller(@PathVariable("sellerName") String sellerName){
		return repository.findBySellerName(sellerName);
	}
	
	@GetMapping(value= "/allOrdersByBuyer/{buyerName}")
	public Optional<Orders> findOrdersByBuyer(@PathVariable("buyerName") String buyerName){
		return repository.findByBuyerName(buyerName);
	}
}
