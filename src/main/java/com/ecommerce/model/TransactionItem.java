package com.ecommerce.model;

import org.joda.time.DateTime;

public class TransactionItem {
	
	private String customerId;
	private String merchantId;
	private String productId;
	private DateTime dateTime;
	
	private double purchaseTotal;
	private double borrowedAmt;
	private double balance;
	
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public DateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(DateTime dateTime) {
		this.dateTime = dateTime;
	}
	public double getPurchaseTotal() {
		return purchaseTotal;
	}
	public void setPurchaseTotal(double purchaseTotal) {
		this.purchaseTotal = purchaseTotal;
	}
	public double getBorrowedAmt() {
		return borrowedAmt;
	}
	public void setBorrowedAmt(double borrowedAmt) {
		this.borrowedAmt = borrowedAmt;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
