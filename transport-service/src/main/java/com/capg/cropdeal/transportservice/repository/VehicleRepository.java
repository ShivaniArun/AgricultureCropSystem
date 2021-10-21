package com.capg.cropdeal.transportservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capg.cropdeal.transportservice.model.VehicleDetails;

public interface VehicleRepository extends MongoRepository<VehicleDetails, Integer>{

}
