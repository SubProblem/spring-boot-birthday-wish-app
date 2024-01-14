package com.subproblem.birthdaywishapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BirthdayWishAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BirthdayWishAppApplication.class, args);
	}

}
