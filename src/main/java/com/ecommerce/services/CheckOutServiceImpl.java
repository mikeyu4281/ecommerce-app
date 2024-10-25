package com.ecommerce.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Order;
import com.ecommerce.model.PaymentMethod;
import com.ecommerce.model.PaymentRequest;
import com.ecommerce.model.PaymentResponse;
import com.ecommerce.model.Product;
import com.ecommerce.model.ShoppingCart;
import com.stripe.Stripe;
import com.stripe.StripeClient;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import com.stripe.model.Customer;
import com.stripe.model.PaymentIntent;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.CustomerCreateParams;
import com.stripe.param.PaymentIntentCreateParams;

import lombok.Data;

@Service
public class CheckOutServiceImpl implements CheckOutService {

	@Autowired
	private ShoppingCart shoppingCart;

	public CheckOutServiceImpl(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	@Override
	public double calculateTotalCost(List<Product> products) {
		// TODO Auto-generated method stub

		double totalCost = 0;
		for (Product product : products) {
			totalCost += product.getPrice();
		}

		return totalCost;
	}

	public void checkOut(List<Product> products,PaymentMethod paymentMethod,
			PaymentRequest paymentRequest) {
		this.handlePayment(products, paymentMethod, paymentRequest);
		
	}

	private PaymentResponse handlePayment(List<Product> products, PaymentMethod paymentMethod,
			PaymentRequest paymentRequest) {

				
				
		long longValue = (long) paymentRequest.getPaymentAmount();
		Stripe.apiKey = "sk_test_4eC39HqLyjWDarjtT1zdp7dc";
		PaymentIntentCreateParams params = PaymentIntentCreateParams.builder().setAmount(longValue).setCurrency("usd")
				.setAutomaticPaymentMethods(
						PaymentIntentCreateParams.AutomaticPaymentMethods.builder().setEnabled(true).build())
				.build();
		try {
			PaymentIntent paymentIntent = PaymentIntent.create(params);
		} catch (StripeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PaymentResponse response = new PaymentResponse();
		response.setPaymentStatus("Complete");
	
		return response;
	}

}
