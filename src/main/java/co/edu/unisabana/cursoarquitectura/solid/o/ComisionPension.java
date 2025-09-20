package co.edu.unisabana.cursoarquitectura.solid.o;

public class ComisionPension implements IComision{
    @Override
    public double calcular(double monto) {
        return monto * 0.04;
    }
}
