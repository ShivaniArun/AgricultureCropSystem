package com.capg.cropdeal.seller.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capg.cropdeal.seller.model.CropDetails;

public interface ProductRepository extends MongoRepository<CropDetails, Integer>{

}
