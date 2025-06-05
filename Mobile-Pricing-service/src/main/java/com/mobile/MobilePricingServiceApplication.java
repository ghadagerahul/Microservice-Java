package com.mobile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MobilePricingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobilePricingServiceApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate getresRestTemplate() {
		return new RestTemplate();
	}

}
