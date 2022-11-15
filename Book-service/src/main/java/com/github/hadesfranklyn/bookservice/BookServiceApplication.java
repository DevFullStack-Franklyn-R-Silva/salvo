package com.github.hadesfranklyn.bookservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication 
@EnableFeignClients
public class BookServiceApplication {
//(scanBasePackages={"com.github.hadesfranklyn.bookservice.proxy.CambioProxy"})
	public static void main(String[] args) {
		SpringApplication.run(BookServiceApplication.class, args);
	}

}
