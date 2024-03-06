package org.example.Ejercicio14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class Test_CalculadoraFinanciera {
    private static final double DELTA = 0.0001; // Margen de error permitido para comparaciones de punto flotante

    @Test
    void testCalcularInteresCompuesto() {
        CalculadoraFinanciera calculadora = new CalculadoraFinanciera();

        // Caso de prueba 1
        double resultado1 = calculadora.calcularInteresCompuesto(1000, 0.05, 12, 5);
        assertEquals(1647.0099, resultado1, DELTA);

        // Caso de prueba 2
        double resultado2 = calculadora.calcularInteresCompuesto(2000, 0.03, 4, 10);
        assertEquals(3243.3043, resultado2, DELTA);
    }

    @Test
    void testCalcularVPN() {
        CalculadoraFinanciera calculadora = new CalculadoraFinanciera();

        // Caso de prueba 1
        double[] flujosCaja1 = {-1000, 200, 300, 400, 500}; // Inversión inicial de 1000 y flujos positivos posteriores
        double resultado1 = calculadora.calcularVPN(0.1, flujosCaja1);
        assertEquals(1031.6562, resultado1, DELTA);

        // Caso de prueba 2
        double[] flujosCaja2 = {-5000, 1000, 2000, 3000}; // Inversión inicial de 5000 y flujos positivos posteriores
        double resultado2 = calculadora.calcularVPN(0.05, flujosCaja2);
        assertEquals(3903.8585, resultado2, DELTA);
    }
}