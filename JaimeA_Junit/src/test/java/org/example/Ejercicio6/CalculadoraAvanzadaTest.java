package org.example.Ejercicio6;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Jaime Agüero

public class CalculadoraAvanzadaTest {

    CalculadoraAvanzada calculadora = new CalculadoraAvanzada();

    @Disabled
    @Test
    void testFactorial() {
             assertEquals(1, calculadora.factorial(0));
             assertEquals(1, calculadora.factorial(1));
            assertEquals(2, calculadora.factorial(2));
             assertEquals(6, calculadora.factorial(3));
             assertEquals(24, calculadora.factorial(4));
         }
}