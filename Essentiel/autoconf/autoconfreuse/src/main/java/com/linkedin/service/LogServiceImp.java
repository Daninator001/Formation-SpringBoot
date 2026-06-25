package com.linkedin.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LogServiceImp implements LogService {

    @Autowired
    private LogProperties properties;

    Logger logger = LoggerFactory.getLogger(LogServiceImp.class);

    @Override
    public void tracer(String Message) {
        logger.info(properties.getPrefix() + " Information LogServiceImp: " + Message + " " + properties.getSuffix());
    }
}
