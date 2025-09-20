package co.edu.unisabana.cursoarquitectura.solid.o;

public class ComisionAhorros implements IComision{
    @Override
    public double calcular(double monto) {
        return monto * 0.01;
    }
}
