package com.capg.cropdeal.buyer.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.cropdeal.buyer.model.Buyer;
import com.capg.cropdeal.buyer.repository.BuyerRepository;

@RestController
public class BuyerController {
	
	@Autowired
	private BuyerRepository repository;
	
	@GetMapping("/findAllBuyer")
	public List<Buyer> viewAllBuyerDetails() {
		return repository.findAll();
	}
	
	@GetMapping(value ="/findAllBuyer/{id}")
	public Optional<Buyer> getBuyerById(@PathVariable("id") int id){
		return repository.findById(id);
	}
	
	@PostMapping("/addBuyer")
	public Buyer addBuyerDetails(@RequestBody Buyer buyer) {
		repository.save(buyer);
		return buyer;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteBuyer(@PathVariable("id") int id) {
		repository.deleteById(id);
		return "Buyer deleted";
	}
}
