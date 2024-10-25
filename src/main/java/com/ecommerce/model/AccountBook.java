package com.ecommerce.model;

import java.sql.Date;

public class AccountBook {
	
	/*
	 * 
		//merchant name , transaction date, 
		//total balance ,  total borrowed 
		//product information 
		//remaining balance

	 */

	private String merchantName; 
	private Date transactionDate; 
	private double totalAmt;
	private double remainingBalance;
	
	
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public double getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(double totalAmt) {
		this.totalAmt = totalAmt;
	}
	public double getRemainingBalance() {
		return remainingBalance;
	}
	public void setRemainingBalance(double remainingBalance) {
		this.remainingBalance = remainingBalance;
	}
	
	
}
