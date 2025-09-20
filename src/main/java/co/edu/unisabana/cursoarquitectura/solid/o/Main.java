package co.edu.unisabana.cursoarquitectura.solid.o;

public class Main {
    public static void main(String[] args) {

        CalculoComisiones caluladoraComision = new CalculoComisiones();
        caluladoraComision.calcularComision(new ComisionNomina(), 1000);
    }
}
