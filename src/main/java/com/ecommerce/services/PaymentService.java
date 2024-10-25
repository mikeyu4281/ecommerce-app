package com.ecommerce.services;

import org.springframework.stereotype.Service;

import com.ecommerce.model.Order;
import com.ecommerce.model.PaymentResponse;

@Service
public interface PaymentService {

	public PaymentResponse makePayment(Order order);
}
