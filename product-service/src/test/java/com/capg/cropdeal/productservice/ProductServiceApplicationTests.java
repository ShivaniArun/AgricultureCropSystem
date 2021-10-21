 package com.capg.cropdeal.productservice;

import static org.mockito.Mockito.when;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.cropdeal.productservice.models.CropDetails;
import com.capg.cropdeal.productservice.repository.ProductRepository;
import com.capg.cropdeal.productservice.resources.CropController;

@RunWith(SpringRunner.class)
@SpringBootTest
class ProductServiceApplicationTests {

	@Autowired
	private CropController controller;
	
	@MockBean
	private ProductRepository repository;
	
	@Test
	public void findAllCropTest() {
		
	}
}
