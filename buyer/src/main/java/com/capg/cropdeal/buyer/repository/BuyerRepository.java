package com.capg.cropdeal.buyer.repository;

import org.springframework.boot.autoconfigure.mongo.MongoClientSettingsBuilderCustomizer;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.capg.cropdeal.buyer.model.Buyer;

public interface BuyerRepository extends MongoRepository<Buyer, Integer> {

}
