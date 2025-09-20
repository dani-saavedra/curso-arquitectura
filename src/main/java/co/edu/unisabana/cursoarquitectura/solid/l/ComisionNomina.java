package co.edu.unisabana.cursoarquitectura.solid.l;

public class ComisionNomina extends Comision {

    public double calcularComision(double monto) {
        return monto * 0.11;
    }

    public double restarComision(double monto) {
        return monto - 0.11;
    }

    public double determinarIva(double monto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
