package com.psytest.myproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.psytest.myproject.dao")
@ComponentScan(basePackages = {"com.psytest.myproject.*"})
public class PsytestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PsytestApplication.class, args);
	}

}
