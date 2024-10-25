package com.ecommerce.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.model.Product;

@Service
public interface ShoppingCartService {
	
	
	public void addProductToCart(Product product);
	
	public List<Product> viewCart();

	public void removeByProductId(String product);
	
	public void removeProduct(Product product);

}
