package com.capg.cropdeal.seller.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.cropdeal.seller.model.Seller;
import com.capg.cropdeal.seller.repository.SellerRepository;

@RestController
public class SellerController {

	@Autowired
	private SellerRepository repository;
	
	@GetMapping("/findAllSeller")
	public List<Seller> viewAllSellerDetails() {
		return repository.findAll();
	}
	
	@GetMapping(value ="/findAllSeller/{id}")
	public Optional<Seller> getSellerById(@PathVariable("id") int id){
		return repository.findById(id);
	}
	
	@PostMapping("/addSeller")
	public Seller addSellerDetails(@RequestBody Seller seller) {
		repository.save(seller);
		return seller;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteSeller(@PathVariable("id") int id) {
		repository.deleteById(id);
		return "Seller deleted";
	}
}
