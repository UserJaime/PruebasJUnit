package org.example.Ejercicio13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class GestorDeTareasTest {

    //Jaime Agüero

    @Nested
    class AgregarTareaTest {
        private GestorDeTareas gestor;

        @BeforeEach
        void setUp() {
            gestor = new GestorDeTareas();
        }

        @Test
        void AgregarTareaCorrectamente() {
            gestor.agregarTarea("1", "Peinar a Luis");
            Optional<String> descripcion = gestor.buscarTareaPorId("1");
            assertTrue(descripcion.isPresent());
            assertEquals("Peinar a Luis", descripcion.get());
        }
    }

    @Nested
    class EliminarTareaTest {
        private GestorDeTareas gestor;

        @BeforeEach
        void setUp() {
            gestor = new GestorDeTareas();
            gestor.agregarTarea("1", "Peinar a Luis");
        }

        @Test
        void EliminarTareaExistente() {
            boolean eliminada = gestor.eliminarTarea("1");
            assertTrue(eliminada);
            Optional<String> descripcion = gestor.buscarTareaPorId("1");
            assertTrue(descripcion.isEmpty());
        }

        @Test
        void RetornarFalsoTareaInexistente() {
            boolean eliminada = gestor.eliminarTarea("2");
            assertFalse(eliminada);
        }
    }

    @Nested
    class BuscarTarea {
        private GestorDeTareas gestor;

        @BeforeEach
        void setUp() {
            gestor = new GestorDeTareas();
            gestor.agregarTarea("1", "Peinar a Luis");
        }

        @Test
        void TareaExistente() {
            Optional<String> descripcion = gestor.buscarTareaPorId("1");
            assertTrue(descripcion.isPresent());
            assertEquals("Peinar a Luis", descripcion.get());
        }

        @Test
        void VacioTareaInexistente() {
            Optional<String> descripcion = gestor.buscarTareaPorId("2");
            assertTrue(descripcion.isEmpty());
        }
    }
}

