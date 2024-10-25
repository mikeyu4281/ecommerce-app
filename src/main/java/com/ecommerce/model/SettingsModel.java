package com.ecommerce.model;

public class SettingsModel {

	private int frequencyCount;
	
	private float transactionAmountFilter;
	
	
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
