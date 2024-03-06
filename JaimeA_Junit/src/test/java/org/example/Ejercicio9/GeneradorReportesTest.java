package org.example.Ejercicio9;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class GeneradorReportesTest {

    GeneradorReportes generador = new GeneradorReportes();

    //Jaime Agüero

    @TestFactory
    Stream<DynamicTest> testGenerarReporte() {
        List<String> datos = Arrays.asList("Dato 1", "Dato 2", "Dato 3");

        // Genera una prueba dinámica para cada dato de entrada
        return datos.stream().map(dato ->
                dynamicTest("Prueba para " + dato, () -> {
                    String reporteGenerado = generador.generarReporte(Arrays.asList(dato));
                    assertEquals("Reporte:\n- " + dato + "\n", reporteGenerado);
                })
        );
    }
}
