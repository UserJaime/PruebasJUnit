package org.example.Ejercicio15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestControladorAcceso {

    //Jaime Agüero
    private ControladorAcceso controlador;

    @BeforeEach
    public void setUp() {
        controlador = new ControladorAcceso();
    }

    @Test
    public void testAdmin() {
        controlador.asignarRolAUsuario("admin", "ADMIN");
        assertTrue(controlador.verificarAcceso("admin", "GESTION_USUARIOS y CONSULTA"));
    }

    @Test
    public void testEditor() {
        controlador.asignarRolAUsuario("editor", "EDITOR");
        assertFalse(controlador.verificarAcceso("editor", "GESTION_USUARIOS"));
        assertTrue(controlador.verificarAcceso("editor", "CONSULTA"));
    }

    @Test
    public void testVisitante() {
        controlador.asignarRolAUsuario("visitante", "VISITANTE");
        assertFalse(controlador.verificarAcceso("visitante", "GESTION_USUARIOS"));
        assertTrue(controlador.verificarAcceso("visitante", "CONSULTA"));
    }

    @Test
    public void testOtro() {
        controlador.asignarRolAUsuario("otro", "OTRO");
        assertFalse(controlador.verificarAcceso("otro", "GESTION_USUARIOS"));
        assertFalse(controlador.verificarAcceso("otro", "CONSULTA"));
    }
}