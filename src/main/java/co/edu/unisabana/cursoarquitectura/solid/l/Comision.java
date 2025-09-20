package co.edu.unisabana.cursoarquitectura.solid.l;

public class Comision {

    public double calcularComision(double monto) {
        return monto * 0.10;
    }

    public double restarComision(double monto) {
        return monto - 0.10;
    }

    public double determinarIva(double monto) {
        return monto * 0.19;
    }
}
