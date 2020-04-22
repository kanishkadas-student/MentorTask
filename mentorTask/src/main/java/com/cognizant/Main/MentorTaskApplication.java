package com.cognizant.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages="com.cognizant")
public class MentorTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(MentorTaskApplication.class, args);
	}

}
