package com.ecommerce.model;

import java.util.Date;

import org.joda.time.DateTime;

public class ShoppingCartEvent {

	private String EventName;
	private Date timestamp;
	
	public String getEventName() {
		return EventName;
	}
	public void setEventName(String eventName) {
		EventName = eventName;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	
	
}
