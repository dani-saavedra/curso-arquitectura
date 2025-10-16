package co.edu.unisabana.cursoarquitectura;

import co.edu.unisabana.cursoarquitectura.solid.d.dominio.PagoProducto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {


    @GetMapping(path = "/saludo")
    public String saludar() {
        return "todo bien desde K8S";
    }

}
