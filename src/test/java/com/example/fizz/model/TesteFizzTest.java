package com.example.fizz.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TesteFizzTest {

    @Test
    @DisplayName("Se retorno numero 1")
    public void teste_retorno_numero_1() throws Exception {
        TesteFizz fizz = new TesteFizz();
        assertEquals("1", fizz.getResultado(1));
    }

    @Test
    @DisplayName("Se retorno numero 2")
    public void teste_retorno_numero_2() throws Exception {
        TesteFizz fizz = new TesteFizz();
        assertEquals("2", fizz.getResultado(2));
    }

    @Test
    @DisplayName("Se retorno Fizz")
    public void teste_retorno_fizz() throws Exception {
        TesteFizz fizz = new TesteFizz();
        assertEquals("Fizz", fizz.getResultado(3));
    }

    @Test
    @DisplayName("Se retorno Buzz")
    public void teste_retorno_buzz() throws Exception {
        TesteFizz fizz = new TesteFizz();
        assertEquals("Buzz", fizz.getResultado(5));
    }

    @Test
    @DisplayName("Se retorno FizzBuzz")
    public void teste_retorno_fizzbuzz() throws Exception {
        TesteFizz fizz = new TesteFizz();
        assertEquals("FizzBuzz", fizz.getResultado(15));
    }

    @Test
    @DisplayName("Imprime lista de 1 a 100")
    public void teste_imprime_lista_1_100() throws Exception {
        TesteFizz fizz = new TesteFizz(1,100);
        assertEquals(100, fizz.loopImpressao());
    }
}
