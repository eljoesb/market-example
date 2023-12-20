package com.example.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MarketApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(MarketApplication.class, args);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
