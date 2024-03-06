package org.example.Ejercicio16;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GeneradorNumerosTest {

    //Jaime Agüero
    GeneradorNumeros generador = new GeneradorNumeros();

    @Test
    void testGenerarNumeroAleatorioEnRango() {
        // Probar con varios rangos aleatorios
        for (int i = 0; i < 100; i++) { // Realizar 100 pruebas
            int min = (int) (Math.random() * 100); // Generar un mínimo aleatorio
            int max = min + (int) (Math.random() * 100); // Generar un máximo aleatorio mayor que el mínimo
            int numeroAleatorio = generador.generarNumeroAleatorioEnRango(min, max);
            assertTrue(numeroAleatorio >= min && numeroAleatorio <= max,
                    "El número aleatorio no está dentro del rango especificado");
        }
    }

    @Test
    void testEsPar() {
        // Probar con varios números aleatorios
        for (int i = 0; i < 100; i++) { // Realizar 100 pruebas
            int numero = (int) (Math.random() * Integer.MAX_VALUE); // Generar un número aleatorio
            boolean resultadoEsPar = generador.esPar(numero);
            assertEquals(numero % 2 == 0, resultadoEsPar,
                    "La función esPar no está devolviendo el resultado esperado");
        }
    }
}
