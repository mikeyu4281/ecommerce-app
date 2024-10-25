package com.ecommerce.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Caching;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.PaymentResponse;
import com.ecommerce.model.Product;
import com.ecommerce.model.ShoppingCart;
import com.ecommerce.model.ShoppingCartEvent;
import com.ecommerce.services.CustomerHistoryService;
import com.ecommerce.services.ShoppingCartService;

@RestController
public class CommerceController {
	

	@Autowired
	private ShoppingCartService shoppingCartService;
	
	@GetMapping(path = "/viewCart", produces = "application/json")
	public ResponseEntity<List<Product>> viewCart(@RequestParam("customerId") String customerId) {

		List<Product> list = shoppingCartService.viewCart();
		
		
		return new ResponseEntity<List<Product>>(list, HttpStatus.OK);
	}

	@PostMapping(path = "/addProduct", consumes = "application/json", produces = "application/json")
	public ResponseEntity<ShoppingCartEvent> addToCart(@RequestBody Product product) {

		shoppingCartService.addProductToCart(product);
		System.out.println("Product added");
	
		ShoppingCartEvent event = new ShoppingCartEvent();
		event.setEventName("Product added");
		event.setTimestamp(new Date());
	
		return new ResponseEntity<ShoppingCartEvent>(event, HttpStatus.OK);
	}
	
	@PostMapping(path = "/deleteProduct", consumes = "application/json", produces = "application/json")
	public ResponseEntity<ShoppingCartEvent> deleteByProductId(@RequestBody Product product) {

		System.out.println(product.toString());
		shoppingCartService.removeProduct(product);
		
		ShoppingCartEvent event = new ShoppingCartEvent();
		event.setEventName("Item Removed");
		event.setTimestamp(new Date());
	
		return new ResponseEntity<ShoppingCartEvent>(event, HttpStatus.OK);
	}
	
	@PostMapping(path = "/checkOut", consumes = "application/json", produces = "application/json")
	public ResponseEntity<PaymentResponse> getData(@RequestBody ShoppingCart cart) {

		
		PaymentResponse response = null;
		
		return new ResponseEntity<PaymentResponse>(response, HttpStatus.OK);
	}
}
