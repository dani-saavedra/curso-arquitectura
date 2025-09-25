package co.edu.unisabana.cursoarquitectura.unit;

import co.edu.unisabana.cursoarquitectura.pruebas.service.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculadoraTest {


    Calculadora calculadora = new Calculadora();

    @Test
    void suma() {
        //AAA (Arrange, Act, Assertion)
        //Preprar, ejecutar y VALIDAR.
        int resultado = calculadora.suma(2, 3);

        Assertions.assertEquals(5, resultado);

        //Cuantas Unit test minimo necesitamos en nuestro código/método? (Complejidad Ciclomatica)
    }
    //smock, Mock,
    // Cubrir los edge cases, ¿sería eso?
}