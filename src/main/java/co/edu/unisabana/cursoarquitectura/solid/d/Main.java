package co.edu.unisabana.cursoarquitectura.solid.d;

import co.edu.unisabana.cursoarquitectura.solid.d.dominio.PagoProducto;
import co.edu.unisabana.cursoarquitectura.solid.d.infraestructura.out.NotificacionTwilioAdapter;

public class Main {
    public static void main(String[] args) {
        PagoProducto pagoProducto = new PagoProducto(new NotificacionTwilioAdapter());
       // pagoProducto.pagarProducto("Arroz", 100, 302546707);

    }
}
