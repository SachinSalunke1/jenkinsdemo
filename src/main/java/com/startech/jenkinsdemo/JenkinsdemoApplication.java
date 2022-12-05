package com.startech.jenkinsdemo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsdemoApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(JenkinsdemoApplication.class);

	@PostConstruct
	public void init() {
		LOGGER.info("Application initialized");
	}
	public static void main(String[] args) {
		SpringApplication.run(JenkinsdemoApplication.class, args);
	}

}
