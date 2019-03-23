package com.books.chapters.restfulapi.patterns.chap4.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InvestorServicesApplication {

	public static void main(String[] args) {
		// SpringApplication.run(InvestorServicesApplication.class, args);
		SpringApplication springApplication = new SpringApplication(InvestorServicesApplication.class);
		springApplication.setBannerMode(Mode.OFF);
		springApplication.run(args);

	}
}
