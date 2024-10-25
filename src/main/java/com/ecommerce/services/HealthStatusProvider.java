package com.ecommerce.services;

import org.springframework.boot.actuate.health.HealthEndpoint;
import org.springframework.stereotype.Component;
import org.springframework.boot.actuate.health.Status;

@Component
public class HealthStatusProvider {

	private final HealthEndpoint healthEndpoint;

	public HealthStatusProvider(HealthEndpoint healthEndpoint) {
	       this.healthEndpoint = healthEndpoint;
	   }

	public Status getHealthStatus() {
	       return this.healthEndpoint.health().getStatus();
	}
}
