package com.example.aws_demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.assertj.MockMvcTester;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest
public class awsControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void awsControllerEndpoint() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/healthcheck")).
                andExpect(MockMvcResultMatchers.status().isOk());

    }
}
