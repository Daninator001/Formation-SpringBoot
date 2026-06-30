package com.linkedin.commandlinerunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommandlinerunnerApplication {

	private static final Logger logger = LoggerFactory.getLogger(CommandLineRunner1.class);

	public static void main(String[] args) {
		logger.info("==Début==");
		SpringApplication.run(CommandlinerunnerApplication.class, args);
		logger.info("==Fin==");
	}

}
