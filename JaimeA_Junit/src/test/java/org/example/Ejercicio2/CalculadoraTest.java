package org.example.Ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    //Jaime Agüero

    @Test
    public void t_sumar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    public void t_restar() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.restar(5, 3));
    }

    @Test
    public void t_multiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(15, calc.multiplicar(5, 3));
    }

    @Test
    public void t_dividir() {
        Calculadora calc = new Calculadora();
        assertEquals(2.0, calc.dividir(6, 3));
    }

    @Test
    public void t_dividirentrecero() {
        Calculadora calc = new Calculadora();
        assertThrows(ArithmeticException.class, () -> calc.dividir(6, 0));
    }
}