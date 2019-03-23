package com.books.chapters.restfulapi.patterns.chap3.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InvestorServicesApplication {

	public static void main(String[] args) {
		//SpringApplication.run(InvestorServicesApplication.class, args);
		SpringApplication sa=new SpringApplication(InvestorServicesApplication.class);
		sa.setBannerMode(Mode.OFF);
		sa.run(args);
		
		
	}
}
