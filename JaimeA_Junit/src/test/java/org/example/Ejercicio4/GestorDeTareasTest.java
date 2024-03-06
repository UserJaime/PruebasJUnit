package org.example.Ejercicio4;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class GestorDeTareasTest {
    private GestorDeTareas gestor;

    //Jaime Agüero

    @BeforeEach
    public void setUp() {
        gestor = new GestorDeTareas();
        gestor.agregarTarea("Dejar de llorar");
        gestor.agregarTarea("Ponerse a hacer Junit de Luis");
        gestor.agregarTarea("Sacar un 10");
    }

    @AfterEach
    public void tearDown() {
        gestor.limpiarTareas();
    }

    @Test
    public void testAgregarTarea() {
        gestor.agregarTarea("Peinar calvos");
        List<String> tareas = gestor.obtenerTareas();
        assertEquals(4, tareas.size());
        assertTrue(tareas.contains("Peinar calvos"));
    }

    @Test
    public void testEliminarTarea() {
        gestor.eliminarTarea("Ponerse a hacer Junit de Luis");
        List<String> tareas = gestor.obtenerTareas();
        assertEquals(2, tareas.size());
        assertTrue(tareas.contains("Dejar de llorar"));
        assertTrue(tareas.contains("Sacar un 10"));
    }

    @Test
    public void testLimpiarTareas() {
        gestor.limpiarTareas();
        List<String> tareas = gestor.obtenerTareas();
        assertEquals(0, tareas.size());
    }
}

