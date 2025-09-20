package co.edu.unisabana.cursoarquitectura;

import co.edu.unisabana.cursoarquitectura.solid.d.dominio.PagoProducto;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagoController {


    PagoProducto pago;

    public PagoController(PagoProducto pago) {
        this.pago = pago;
    }

    @GetMapping(path = "/pagar/{producto}/{origen}")
    public String pagar(@PathVariable String producto, @PathVariable String origen) {
        pago.pagarProducto(producto, 12, 13, origen);
        return "todo bien";
    }

}
