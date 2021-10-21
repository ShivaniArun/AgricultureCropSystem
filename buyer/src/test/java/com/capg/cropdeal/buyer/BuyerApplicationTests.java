package com.capg.cropdeal.buyer;

import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.capg.cropdeal.buyer.model.Buyer;
import com.capg.cropdeal.buyer.repository.BuyerRepository;
import com.capg.cropdeal.buyer.resource.BuyerController;

@SpringBootTest
class BuyerApplicationTests {

	@Autowired
	private BuyerController controller;
	
	@MockBean
	private BuyerRepository repository;
	
	@Test
	public void findAllSellerTest() {
		when(repository.findAll()).thenReturn(Stream.of
				(new Buyer(101,"Buyer","Punjab",50,89),
						new Buyer(102,"Buyer2","Punjab",50,0))
		.collect(Collectors.toList()));
		assertEquals(2,controller.viewAllBuyerDetails().size());
	}
	
	@Test
	public void findSellerByIdTest() {
		int id = 101;
		Optional<Buyer> s = Optional.of(new Buyer(101,"Buyer","Bihar",50,379));
		when(repository.findById(id)).thenReturn(s);
		assertEquals(s, controller.getBuyerById(id));
	}
	
	@Test
	public void addSellerDetailsTest() {
		Buyer s = new Buyer(101,"Buyer","Bihar",50,379);
		when(repository.save(s)).thenReturn(s);
		assertEquals(s, controller.addBuyerDetails(s));
	}
	
	@Test
	public void deleteSellerTest() {
		int id = 101;
		controller.deleteBuyer(id);
		verify(repository,times(1)).deleteById(id);
	}


}
