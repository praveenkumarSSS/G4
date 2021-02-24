package com.example.jdbcex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableAutoConfiguration
@Component
public class JdbcexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdbcexampleApplication.class, args);
	}

}
