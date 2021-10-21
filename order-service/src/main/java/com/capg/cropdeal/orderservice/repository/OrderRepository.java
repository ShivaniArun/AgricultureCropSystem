package com.capg.cropdeal.orderservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.capg.cropdeal.orderservice.model.Orders;

public interface OrderRepository extends MongoRepository<Orders, String>{

	@Query(value = "{sellerName:?3}")
	public Optional<Orders> findBySellerName(String sellerName);
	
	@Query(value = "{buyerName:?4}")
	public Optional<Orders> findByBuyerName(String buyerName);
}
