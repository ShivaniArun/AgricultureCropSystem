package com.capg.cropdeal.buyer.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capg.cropdeal.buyer.model.CropDetails;

@Service
@RestController
public class BuyerService {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/allProducts")
	public List<CropDetails> getProductsList(){
		String url = "http://localhost:8086/findAllCrop";
		CropDetails[] list = restTemplate.getForObject(url,CropDetails[].class);
		return Arrays.asList(list);
	}
}
