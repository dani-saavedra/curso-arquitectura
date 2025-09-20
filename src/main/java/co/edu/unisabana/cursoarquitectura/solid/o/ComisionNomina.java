package co.edu.unisabana.cursoarquitectura.solid.o;

public class ComisionNomina implements IComision{
    @Override
    public double calcular(double monto) {
        return monto * 0.03;
    }
}
