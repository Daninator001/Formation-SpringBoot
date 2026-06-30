package com.linkedin.commandlinerunner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class CommandLineRunner1 implements CommandLineRunner{

    private final Logger logger = LoggerFactory.getLogger(CommandLineRunner1.class);
    @Override
    public void run(String... args) throws Exception {
        logger.info("Dans la méthode run () de CommandLineRunner1");
    }

}
