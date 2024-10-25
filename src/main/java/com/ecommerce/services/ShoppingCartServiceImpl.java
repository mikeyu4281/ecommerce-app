package com.ecommerce.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.model.Product;
import com.ecommerce.model.ShoppingCart;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

	private ShoppingCart cart;
	
	public ShoppingCartServiceImpl(ShoppingCart newCart) {
		this.cart = newCart;
	}
	
	
	@Override
	public void addProductToCart(Product product) {
		// TODO Auto-generated method stub
		cart.addProductToCart(product);
		
	}

	@Override
	public List<Product> viewCart() {
		// TODO Auto-generated method stub
		return cart.viewShoppingCart();
	}

	
	@Override
	public void removeProduct(Product product) {
		// TODO Auto-generated method stub
		System.out.println("Removing product " + product.toString());
		cart.removeItem(product);
	}


	@Override
	public void removeByProductId(String productId) {
		// TODO Auto-generated method stub
		
		cart.removeByProductId(productId);
	}

}
