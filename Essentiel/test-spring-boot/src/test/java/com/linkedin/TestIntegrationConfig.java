package com.linkedin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.client.RestClient;

@AutoConfiguration
public class TestIntegrationConfig {

    @Bean
    @Lazy
    RestClient restClient(@Value("${local.server.port}") int port) {
        return RestClient.builder()
                .baseUrl("http://localhost:" + port)
                .build();
    }
}
