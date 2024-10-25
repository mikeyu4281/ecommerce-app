package com.ecommerce.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Product> productList;
	
	
	public ShoppingCart(){
		productList = new ArrayList<Product>();
	}
	
	
	public void addProductToCart(Product product) {
		productList.add(product);
	}
	
	public List<Product> viewShoppingCart(){
		return productList;	
	}
	
	
	public void removeByProductId(String productId) {
		System.out.println("Remove product id: " + productId);
		
		for(Product item: this.productList) {
			System.out.println(item.getProductId());
			
			System.out.println(item.toString());
		
		}
		
		
	}
	
	
	public void removeItem(Product product) {
		
		int index = 0;
		System.out.println("Product id " + product.getProductId());
		this.productList.lastIndexOf(product);
		index = this.productList.lastIndexOf(product);
		System.out.println(" Index of product " + index);

		this.productList.remove(product);
		System.out.println(productList.toString());
	}
	
	public void removeAllProducts() {
		productList.clear();
	}
}
