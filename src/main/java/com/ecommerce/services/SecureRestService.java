package com.ecommerce.services;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

public class SecureRestService {

	private final RestTemplate restTemplate = new RestTemplate();

   // public SecureRestService(RestTemplateBuilder restTemplateBuilder, SslBundles sslBundles) {
   //     this.restTemplate = restTemplateBuilder.setSslBundle(sslBundles.getBundle("mybundle")).build();
   // }
}
