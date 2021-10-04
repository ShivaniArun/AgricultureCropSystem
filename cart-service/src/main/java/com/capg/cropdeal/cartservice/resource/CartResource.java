package com.capg.cropdeal.cartservice.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CartResource {

	@RequestMapping("/cart")
	public void UpdateCart() {
		System.out.println("This is your cart");
	}
}
