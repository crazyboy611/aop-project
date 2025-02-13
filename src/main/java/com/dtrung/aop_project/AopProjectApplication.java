package com.dtrung.aop_project;

import org.aspectj.lang.annotation.Before;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopProjectApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(HelloService helloService) {
		return args -> {
			helloService.sayHello();
		};
	}

}
