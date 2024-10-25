package com.ecommerce.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.model.CustomerData;
import com.ecommerce.model.CustomerProfile;
import com.ecommerce.model.PaymentRequest;
import com.ecommerce.model.PaymentResponse;

@RestController
@RequestMapping("/v1")
public class CustomerController {
	
	/*
	 *   Update customer data 
	 *   get customer name,  email, phone number 
	 *   Open accounts 
	 *   add new customer
	 *   
	 */

	@GetMapping(path = "/getCustomerData", produces = "application/json")
	public ResponseEntity<CustomerProfile> getCustomerData(@RequestParam("custId") String customerId) {

		StringBuilder isinTemp = new StringBuilder();
     
		CustomerProfile customerProfile = null;
		if (customerId == null || customerId.trim().length() == 0) {

			isinTemp.append("Please provide a name!");
			return new ResponseEntity<CustomerProfile>(new CustomerProfile(), HttpStatus.OK);

		} else {

			isinTemp.append(customerId);
			
		}

		

		return new ResponseEntity<CustomerProfile>(customerProfile, HttpStatus.OK);
	}

	@PostMapping(path = "/authenticateUser", consumes = "application/json", produces = "application/json")
	public ResponseEntity<CustomerData> getData(@RequestBody CustomerData customer) {

		Map map = new HashMap();
		
		// System.out.println("Net income:"+ item.getNetIncome());
		// map.put("message", configuration.getMessage());
		// map.put("number", configuration.getNumber());
		// map.put("key", configuration.isValue());
		// System.out.println(item.getAccountsPayable());
		
		PaymentResponse response = null;
	
	//	cloService.buildCashFlowModel(null);
		return new ResponseEntity<CustomerData>(HttpStatus.OK);
	}
	
}
