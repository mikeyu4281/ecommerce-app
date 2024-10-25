package com.ecommerce.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.model.Order;

@Service
public interface CustomerHistoryService {

	public List<Order> getOrders(String id);
}
