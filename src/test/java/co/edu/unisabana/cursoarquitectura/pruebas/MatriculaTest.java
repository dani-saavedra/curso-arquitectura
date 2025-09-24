package co.edu.unisabana.cursoarquitectura.pruebas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MatriculaTest {

    @Mock
    Pago pago;
    //Todos los mock que quieras.

    @InjectMocks
    Matricula matricula;


    @Test
    void CrearMatricula_conNombreLargo_Entonces_RechazaSolicitud() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                matricula.matricular("Otro Sadane Geronimo Miguel",
                        "Apellido", 1990, "Ingeniero"));

    }

    @Test
    void CrearMatricula_conNombreApellidoIgual_Entonces_RechazaSolicitud() {
        Assertions.assertThrows(RuntimeException.class, () ->
                matricula.matricular("Daniel",
                        "Daniel", 1990, "Ingeniero"));

    }

    @Test
    void CrearMatricula_conEdadInvalida_Entonces_RechazaSolicitud() {
        Assertions.assertThrows(RuntimeException.class, () ->
                matricula.matricular("Daniel",
                        "Saavedra", 2006, "Ingeniero"));

    }
    //FIRST:

    //F: Rapidas
    //I: Independientes ( Osea, si pero primero esta o si pero todas al tiempo)
    //R: Repeteable
    //S: Se entienda que esta probando y el resultado
    //T: A tiempo, las PRUEBAS SON PARTE INHERENTE del producto, no son LEGOS que se vendan por separado.

    //Jacoco
    //Mutation Test
    @Test
    void CrearMatricula_datosCorrectos_Entonces_RegistraEstudiante() {
        //Act
        matricula.matricular("Daniel",
                "Saavedra", 2005, "Ingeniero");

        //Assertion: Asegurarnos que se llama a ese metodo.
        Mockito.verify(pago).pagar("Arquitectura");
    }
    // * Nos  falta un test
    // * Algun test falta por ajustar un dato
    // * Hay que ajustar algo en la logica de negocio.
}