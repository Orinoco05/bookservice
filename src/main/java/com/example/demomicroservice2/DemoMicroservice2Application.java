package com.example.demomicroservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoMicroservice2Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoMicroservice2Application.class, args);
	}

}
