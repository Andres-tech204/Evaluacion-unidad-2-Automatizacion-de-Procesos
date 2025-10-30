package cl.iplacex.mi_proyecto;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class CalculadoraTest {
    @Test
    void testSumar() {
        Calculadora miCalculadora = new Calculadora();
        
        int resultado = miCalculadora.sumar(5, 3);

        Assertions.assertEquals(8, resultado);
    
    }

    @Test
    void testRestar() {
        Calculadora miCalculadora = new Calculadora();

        int resultado = miCalculadora.restar(10, 4);

        Assertions.assertEquals(6, resultado);
    }
}