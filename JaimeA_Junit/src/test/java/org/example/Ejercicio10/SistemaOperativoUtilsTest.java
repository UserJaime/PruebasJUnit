package org.example.Ejercicio10;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class SistemaOperativoUtilsTest {


    //Jaime Agüero

    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void testEsWindows() {
        assertEquals(true, SistemaOperativoUtils.esWindows());
    }

    @Test
    @EnabledOnOs(OS.MAC)
    public void testEsMac() {
        assertEquals(true, SistemaOperativoUtils.esMac());
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    public void testEsLinux() {
        assertEquals(true, SistemaOperativoUtils.esLinux());
    }
}