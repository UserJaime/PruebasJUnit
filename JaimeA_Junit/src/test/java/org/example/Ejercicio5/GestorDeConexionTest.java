package org.example.Ejercicio5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GestorDeConexionTest {

    //Jaime Agüero

    @BeforeAll
    public static void abrirConexion() {
        GestorDeConexion.abrirConexion();
    }

    @AfterAll
    public static void cerrarConexion() {
        GestorDeConexion.cerrarConexion();
    }

    @Test
    public void testConexion() {
        assertTrue(true);
    }
}