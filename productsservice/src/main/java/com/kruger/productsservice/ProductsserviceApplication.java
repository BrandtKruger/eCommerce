package com.kruger.productsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProductsserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsserviceApplication.class, args);
	}

}
