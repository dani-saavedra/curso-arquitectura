package co.edu.unisabana.cursoarquitectura.solid.o;

public class CalculoComisiones {

    //Dead Code
    /*
    public double calcularComision(String tipoCuenta, double monto) {
        if (tipoCuenta.equals("AHORRO")) {
            //LOGICA de calcular
            return monto * 0.01;
        } else if (tipoCuenta.equals("CORRIENTE")) {
            return monto * 0.02;
        } else if (tipoCuenta.equals("NOMINA")) {
            return monto * 0.03;
        } else if (tipoCuenta.equals("PENSION")) {
            return monto * 0.04;
        }
        throw new IllegalArgumentException("Tipo de cuenta no " +
                "valido: " + tipoCuenta);
    }

     */

    public double calcularComision(IComision tipoCuenta, double monto) {

        return tipoCuenta.calcular(monto);
    }
}
