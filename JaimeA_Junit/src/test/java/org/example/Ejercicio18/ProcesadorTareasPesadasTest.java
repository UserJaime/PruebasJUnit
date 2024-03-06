package org.example.Ejercicio18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProcesadorTareasPesadasTest {

    //Jaime Agüero

    @Test
    void testRendimientoOperacionIntensiva() {
        ProcesadorTareasPesadas procesador = new ProcesadorTareasPesadas();
        long tiempoInicio = System.currentTimeMillis();

        procesador.realizarOperacionIntensiva();

        long tiempoFin = System.currentTimeMillis();
        long tiempoTotal = tiempoFin - tiempoInicio;


        long limiteTiempo = 1000;


        assertTrue(tiempoTotal <= limiteTiempo,
                "El tiempo total excede el límite aceptable. Tiempo total: " + tiempoTotal + " ms");
    }
}
