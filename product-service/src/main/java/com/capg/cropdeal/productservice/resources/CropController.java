package com.capg.cropdeal.productservice.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.cropdeal.productservice.models.CropDetails;
import com.capg.cropdeal.productservice.repository.ProductRepository;

@RestController
public class CropController {
	
	@Autowired
	private ProductRepository repository;
	
	@GetMapping("/findAllCrop")
	public List<CropDetails> viewAllCropDetails() {
		return repository.findAll();
	}
	
	@GetMapping(value ="/findAllCrop/{id}")
	public Optional<CropDetails> getCropById(@PathVariable("id") int id){
		return repository.findById(id);
	}
	
	@PostMapping("/addCrop")
	public String addCropDetails(@RequestBody CropDetails crop) {
		repository.save(crop);
		return "Crop added";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCrop(@PathVariable("id") int id) {
		repository.deleteById(id);
		return "crop deleted";
	}
}
