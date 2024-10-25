package com.ecommerce.services;

import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ecommerce.model.Order;

@Service
public class CustomerHistoryServiceImpl implements CustomerHistoryService{

	public CustomerHistoryServiceImpl() {
		
	}

	@Cacheable("orders")
	public List<Order> getOrders(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@CacheEvict(value = "order", key = "#id")
    public void deleteByOrderId(Long id) {
        // Method to delete book from the database
   //     actualDatabaseDeleteMethod(id);
    }
	
	@CacheEvict(value = "customer", key = "#id")
    public void deleteAllByCustomerId(Long id) {
        // Method to delete book from the database
   //     actualDatabaseDeleteMethod(id);
    }

}
