package com.books.chapters.restfulapi.patterns.chap4.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InvestorServicesBasicAuthApplication {
	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(InvestorServicesBasicAuthApplication.class);
		springApplication.setBannerMode(Mode.OFF);
		springApplication.run(args);
	}
}
