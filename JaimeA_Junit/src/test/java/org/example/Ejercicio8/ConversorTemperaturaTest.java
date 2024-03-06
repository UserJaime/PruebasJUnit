package org.example.Ejercicio8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ConversorTemperaturaTest {

    //Jaime Agüero
    private final ConversorTemperatura conversor = new ConversorTemperatura();

    @ParameterizedTest(name = "Conversion Grados a Fahrenheit")
    @ValueSource(doubles = {0.0, 25.0, 100.0, -10.0})
    @DisplayName("Prueba de Grados A Fahrenheit")
    public void pruebaGradosAFahrenheit(double grados) {
        double resultado = conversor.celsiusAFahrenheit(grados);
        double esperado = (grados * 9 / 5) + 32;
        assertEquals(esperado, resultado);
    }

    @ParameterizedTest(name = "Conversión de Fahrenheit a Celsius")
    @ValueSource(doubles = {32.0, 77.0, 212.0, -4.0})
    @DisplayName("Prueba de Fahrenheit A Grados")
    public void pruebaFahrenheitAGrados(double fahrenheit) {
        double resultado = conversor.fahrenheitACelsius(fahrenheit);
        double esperado = (fahrenheit - 32) * 5 / 9;
        assertEquals(esperado, resultado, 0.0001);
    }
}