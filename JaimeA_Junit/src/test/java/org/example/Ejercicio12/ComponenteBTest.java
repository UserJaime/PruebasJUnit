package org.example.Ejercicio12;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComponenteBTest {

    @Test
    @Tag("ComponenteB")
    void operacionB() {
        ComponenteB compoB = new ComponenteB();
        assertEquals(42,compoB.operacionB());
    }
}