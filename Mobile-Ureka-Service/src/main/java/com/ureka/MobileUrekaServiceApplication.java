package com.ureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MobileUrekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileUrekaServiceApplication.class, args);
	}

}
