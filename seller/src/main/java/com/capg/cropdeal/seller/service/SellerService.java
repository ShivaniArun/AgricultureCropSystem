package com.capg.cropdeal.seller.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capg.cropdeal.seller.model.CropDetails;
import com.capg.cropdeal.seller.repository.ProductRepository;

@Service
@RestController
public class SellerService {
	
	@Autowired
	private ProductRepository repository;
	
	@PostMapping("/addProduct")
	public String getProductsList(@RequestBody CropDetails crop){
		repository.save(crop);
		return "Crop added";
	}
	
}
