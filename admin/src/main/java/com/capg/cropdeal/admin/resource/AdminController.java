package com.capg.cropdeal.admin.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capg.cropdeal.admin.model.Buyer;
import com.capg.cropdeal.admin.model.Orders;
import com.capg.cropdeal.admin.model.Seller;
import com.capg.cropdeal.admin.model.VehicleDetails;

@RestController
public class AdminController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/allBuyers")
	public List<Buyer> getBuyersList(){
		String url = "http://localhost:8082/findAllBuyer";
		Buyer[] list = restTemplate.getForObject(url,Buyer[].class);
		return Arrays.asList(list);
	}
	
	@GetMapping("/allSellers")
	public List<Seller> getSellersList(){
		String url = "http://localhost:8087/findAllSeller";
		Seller[] list = restTemplate.getForObject(url,Seller[].class);
		return Arrays.asList(list);
	}
	
	@GetMapping("/allVehicles")
	public List<VehicleDetails> getVehiclesList(){
		String url = "http://localhost:8088/allVehicle";
		VehicleDetails[] list = restTemplate.getForObject(url,VehicleDetails[].class);
		return Arrays.asList(list);
	}
	
	@GetMapping("/allOrders")
	public List<Orders> getOrdersList(){
		String url = "http://localhost:8084/allOrders";
		Orders[] list = restTemplate.getForObject(url, Orders[].class);
		return Arrays.asList(list);
	}
}
