package co.edu.unisabana.cursoarquitectura.solid.d.dominio;

import co.edu.unisabana.cursoarquitectura.AchDTO;
import co.edu.unisabana.cursoarquitectura.solid.d.dominio.port.NotificacionPort;
import org.springframework.stereotype.Service;

@Service
public class PagoProducto {

    //Para enteder la inversion de depedencias,
    //primero debemos entener la inyeccion de dependencias.
    //Inyeccion
    // Argumento, variable de clase
    private NotificacionPort notificacion;

    public PagoProducto(NotificacionPort notificacion) {
        this.notificacion = notificacion;
    }

    public void pagarProducto(String producto, int monto, int celular, String cuentaOrigen) {
        AchDTO datosPago = new AchDTO();
        datosPago.setProducto(producto);
        datosPago.setMonto(monto);
        datosPago.setCuentaOrigen(cuentaOrigen);
        System.out.println("Entre a la logica de negocio para pagar " + datosPago);
        //Logica de pagar el producto
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //Enviar una notificacion.
        notificacion.notificar(producto, monto, celular);

        System.out.println("Enviando los datos al proveedor " + datosPago);

    }

}
