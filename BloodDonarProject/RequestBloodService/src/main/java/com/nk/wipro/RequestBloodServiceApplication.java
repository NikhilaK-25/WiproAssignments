package com.nk.wipro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.nk.wipro.Feign")
public class RequestBloodServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RequestBloodServiceApplication.class, args);
	}

}
