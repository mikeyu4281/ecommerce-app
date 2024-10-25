package com.ecommerce.model;

public class Product {
	
	private String productName;
	private double price;
	private String description;
	private String galleryRef;
	private String productId;
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getGalleryRef() {
		return galleryRef;
	}
	public void setGalleryRef(String galleryRef) {
		this.galleryRef = galleryRef;
	}
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", price=" + price + ", description=" + description
				+ ", galleryRef=" + galleryRef + ", productId=" + productId + "]";
	}
	
	
	
	@Override
	public boolean equals(Object o) {
	    // self check
	    if (this == o)
	        return true;
	    // null check
	    if (o == null)
	        return false;
	    // type check and cast
	    if (getClass() != o.getClass())
	        return false;
	    Product product = (Product) o;
	    // field comparison
	    return this.productId.equals(product.getProductId());
	}
	

}
