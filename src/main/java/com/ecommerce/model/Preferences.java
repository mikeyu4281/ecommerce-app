package com.ecommerce.model;

public class Preferences {


	private int frequencyCount;
	//1  every transaction
	//3 every other transaction
	//5 every 5 transactions 
	//10 every 10 transactions
	//0  disable
	
	
	
	private float transactionAmountFilter;
	
	private int smsResponseTimeAllowed;
	
	
	public int getSmsResponseTimeAllowed() {
		return smsResponseTimeAllowed;
	}

	public void setSmsResponseTimeAllowed(int smsResponseTimeAllowed) {
		this.smsResponseTimeAllowed = smsResponseTimeAllowed;
	}

	private boolean includeEmail;

	public int getFrequencyCount() {
		return frequencyCount;
	}

	public void setFrequencyCount(int frequencyCount) {
		this.frequencyCount = frequencyCount;
	}

	public float getTransactionAmountFilter() {
		return transactionAmountFilter;
	}

	public void setTransactionAmountFilter(float transactionAmountFilter) {
		this.transactionAmountFilter = transactionAmountFilter;
	}

	public boolean isIncludeEmail() {
		return includeEmail;
	}

	public void setIncludeEmail(boolean includeEmail) {
		this.includeEmail = includeEmail;
	}
	
}
