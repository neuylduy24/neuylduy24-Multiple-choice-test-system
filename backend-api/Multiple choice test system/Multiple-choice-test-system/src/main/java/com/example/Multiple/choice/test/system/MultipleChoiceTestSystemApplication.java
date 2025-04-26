package com.example.Multiple.choice.test.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MultipleChoiceTestSystemApplication {


	public static void main(String[] args) {
		SpringApplication.run(MultipleChoiceTestSystemApplication.class, args);
	}


}

