package com.linkedin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.web.client.RestClient;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TestIntegrationContextSpringEmbeddedServer {

    @Autowired
    private RestClient restClient;

    @Test
    void hello_doit_retourner_hello_world() {
        String response = this.restClient.get()
                .uri("/")
                .retrieve()
                .body(String.class);

        assertEquals("Hello World", response);
    }

}
