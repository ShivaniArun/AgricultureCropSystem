package com.capg.cropdeal.seller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.cropdeal.seller.model.Seller;
import com.capg.cropdeal.seller.repository.SellerRepository;
import com.capg.cropdeal.seller.resource.SellerController;

@SpringBootTest
@RunWith(SpringRunner.class)
class SellerApplicationTests {

	@Autowired
	private SellerController controller;
	
	@MockBean
	private SellerRepository repository;
	
	@Test
	public void findAllSellerTest() {
		when(repository.findAll()).thenReturn(Stream.of
				(new Seller(101,"Seller2","Punjab",50,0),
						new Seller(102,"Suresh","Bihar",35,456890))
				.collect(Collectors.toList()));
		assertEquals(2,controller.viewAllSellerDetails().size());
	}
	
	@Test
	public void findSellerByIdTest() {
		int id = 101;
		Optional<Seller> s = Optional.of(new Seller(101,"Seller","Bihar",50,379));
		when(repository.findById(id)).thenReturn(s);
		assertEquals(s, controller.getSellerById(id));
	}
	
	@Test
	public void addSellerDetailsTest() {
		Seller s = new Seller(101,"Seller","Bihar",50,379);
		when(repository.save(s)).thenReturn(s);
		assertEquals(s, controller.addSellerDetails(s));
	}
	
	@Test
	public void deleteSellerTest() {
		int id = 101;
		controller.deleteSeller(id);
		verify(repository,atMost(1)).deleteById(id);
	}
}
