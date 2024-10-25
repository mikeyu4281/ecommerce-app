package com.ecommerce.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.model.Order;
import com.ecommerce.model.Product;

@Service
public interface CheckOutService {

	public double calculateTotalCost(List<Product> products);
}
