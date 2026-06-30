package com.linkedin;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class TestIntegrationMockMVCBean {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private HelloService service;

    @Test
    void hello_doit_retourner_hello_world() throws Exception{
        try {
            Mockito.when(service.direBonjour()).thenReturn("Bonjour !");
            this.mockMvc.perform(MockMvcRequestBuilders.get("/")).andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.jsonPath("$").value("Bonjour !"));
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            throw e;
        }

    }

}
