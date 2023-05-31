package com.example.welcomeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class WelcomeAppApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(WelcomeAppApplication.class, args);
		Arrays.stream((applicationContext.getBeanDefinitionNames())).forEach(e-> System.out.println(e));
	}

}
