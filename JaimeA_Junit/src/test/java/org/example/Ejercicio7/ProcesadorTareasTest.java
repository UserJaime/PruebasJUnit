package org.example.Ejercicio7;


import org.junit.Test;


import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class ProcesadorTareasTest {

    //Jaime Agüero
      ProcesadorTareas pb = new ProcesadorTareas();

    @Test
    public void testEjecutarTarea() {
        assertTimeout(ofMillis(10), () -> {pb.ejecutarTareaLarga(90);} );
    }

}