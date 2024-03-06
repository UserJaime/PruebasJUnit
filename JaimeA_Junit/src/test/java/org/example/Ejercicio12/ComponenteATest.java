package org.example.Ejercicio12;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComponenteATest {

    @Test
    @Tag("componenteA")
    void operacionATest() {
        ComponenteA ca = new ComponenteA();
        assertEquals("Resultado de operación A", ca.operacionA());
    }
}