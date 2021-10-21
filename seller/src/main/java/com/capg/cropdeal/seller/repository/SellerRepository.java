package com.capg.cropdeal.seller.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capg.cropdeal.seller.model.Seller;

public interface SellerRepository extends MongoRepository<Seller, Integer>{

}
