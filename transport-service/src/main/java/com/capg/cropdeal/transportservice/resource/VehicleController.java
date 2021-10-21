package com.capg.cropdeal.transportservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.cropdeal.transportservice.model.VehicleDetails;
import com.capg.cropdeal.transportservice.repository.VehicleRepository;

@RestController
public class VehicleController {

	@Autowired
	private VehicleRepository repository;
	
	@GetMapping("/allVehicle")
	public List<VehicleDetails> getAllVehicleDetails(){
		return repository.findAll(); 
	}
	
	@PostMapping("/addVehicle")
	public String addVehicleDetails(@RequestBody VehicleDetails vehicle) {
		repository.save(vehicle);
		return "Vehicle added";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteVehicle(@PathVariable("id") int id) {
		repository.deleteById(id);
		return "Vehicle deleted";
	}
}
