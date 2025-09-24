package co.edu.unisabana.cursoarquitectura.pruebas;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoleteriaController {

    DiscountService discountService;

    public BoleteriaController(DiscountService discountService) {
        this.discountService = discountService;
    }

    @GetMapping("/boleta/{tipoCliente}")
    public ResponseEntity<String> obtenerPrecioBoleta(@RequestParam double precio, @PathVariable String tipoCliente) {
        try {
            precio = discountService.calculatePrice(precio, tipoCliente);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.unprocessableEntity().body(e.getMessage());
        }
        return ResponseEntity.status(200).body("" + precio);
    }

}
