package com.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
public class MobileAptGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileAptGatewayApplication.class, args);
	}

}
