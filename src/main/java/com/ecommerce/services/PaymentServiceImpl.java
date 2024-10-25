package com.ecommerce.services;

import org.springframework.stereotype.Service;

import com.ecommerce.model.Order;
import com.ecommerce.model.PaymentResponse;

@Service
public class PaymentServiceImpl implements PaymentService {


	public PaymentServiceImpl() {
		
	}
	
	
	@Override
	public PaymentResponse makePayment(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

}
