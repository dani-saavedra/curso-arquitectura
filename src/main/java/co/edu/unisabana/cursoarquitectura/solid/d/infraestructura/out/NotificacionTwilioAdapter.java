package co.edu.unisabana.cursoarquitectura.solid.d.infraestructura.out;

import co.edu.unisabana.cursoarquitectura.solid.d.dominio.port.NotificacionPort;
import org.springframework.stereotype.Service;

@Service
public class NotificacionTwilioAdapter implements NotificacionPort {

    @Override
    public void notificar(String producto, int monto, int celular) {
        //logica para enviar esa notificacion.
        // Twilio
        System.out.println("Enviando con Don Tulio");
        //DTO Request, lo enviamos por Rest, y luego hay un Response DTO
        //REST
    }
}
