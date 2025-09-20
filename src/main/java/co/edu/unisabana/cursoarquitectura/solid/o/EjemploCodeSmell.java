package co.edu.unisabana.cursoarquitectura.solid.o;

public class EjemploCodeSmell {

    public static final double IVA = 0.19;

    public void calcularIntereses(String producto, int monto) {
        double v = monto * IVA;

        //bla blab
    }
}
