package com.karina.my_sync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
@EnableAsync
@SpringBootApplication
public class MySyncApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySyncApplication.class, args);
	}

}
