package com.summary_ai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SummaryAiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SummaryAiApplication.class, args);
	}

}
