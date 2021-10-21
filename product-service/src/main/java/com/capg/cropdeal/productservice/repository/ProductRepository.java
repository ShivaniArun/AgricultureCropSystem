package com.capg.cropdeal.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capg.cropdeal.productservice.models.CropDetails;

public interface ProductRepository extends MongoRepository<CropDetails, Integer> {

}
