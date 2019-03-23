package com.books.chapters.restfulapi.patterns.chap4.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Investor_Circuit_Breaker_Services_Consumer_Application {

	public static void main(String[] args) {
		SpringApplication application=new SpringApplication(Investor_Circuit_Breaker_Services_Consumer_Application.class);
		application.setBannerMode(Mode.OFF);
		application.run(args);
	}
}
