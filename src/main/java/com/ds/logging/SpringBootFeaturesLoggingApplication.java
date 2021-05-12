package com.ds.logging;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringBootFeaturesLoggingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFeaturesLoggingApplication.class, args);
		log.info("Simple log statement with inputs {}, {} and {}", 1, 2, 3);
	}

}
