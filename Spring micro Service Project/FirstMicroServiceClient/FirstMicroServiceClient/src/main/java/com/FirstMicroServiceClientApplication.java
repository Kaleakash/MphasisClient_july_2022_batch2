package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com")
@EnableEurekaClient
public class FirstMicroServiceClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstMicroServiceClientApplication.class, args);
		System.out.println("First micro service up!");
	}

}
