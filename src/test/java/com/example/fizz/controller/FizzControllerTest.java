package com.example.fizz.controller;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@WebMvcTest(FizzController.class)
public class FizzControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Se retorno status 200 para usuario")
    public void testar_retorno_http200() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/fizz/usuario?id=1"))
                .andExpect(MockMvcResultMatchers.status().is2xxSuccessful());
    }

    @Test
    @DisplayName("Se retorno status 400 para usuário")
    public void testar_retorno_http400() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/fizz/usuario?id=0"))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

    @Test
    @DisplayName("Se retorno status 200 fizzbuzz")
    public void testar_retorno_http200_fizzbuzz() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/fizz/fizzbuzz/15"))
                .andExpect(MockMvcResultMatchers.status().is2xxSuccessful());
    }

    @Test
    @DisplayName("Se retorno status 400 fizzbuzz")
    public void testar_retorno_http400_fizzbuzz() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.get("/fizz/fizzbuzz"))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }

}
