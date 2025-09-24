package co.edu.unisabana.cursoarquitectura.pruebas;

public class Matricula {

    Pago pago;

    public Matricula(Pago pago) {
        this.pago = pago;
    }

    public void matricular(String nombre,
                           String apellido, int anioNacimiento,
                           String profesion) {
        if (nombre.length() > 25) {
            throw new IllegalArgumentException("No es posible matricular el nombre");
        }
        if (nombre.equals(apellido)) {
            throw new RuntimeException("Estudiante con nombre/apellido raro");
        }
        if (anioNacimiento > 2005) {
            throw new RuntimeException("Es muy joven");
        }
        String curso = null;
        if (profesion.contains("Ingeniero")) {
            curso = "Arquitectura";
        } else {
            curso = "Diseno";
        }
        pago.pagar(curso);
    }
}
