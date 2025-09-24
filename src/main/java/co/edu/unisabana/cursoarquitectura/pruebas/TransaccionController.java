package co.edu.unisabana.cursoarquitectura.pruebas;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transaccion")
public class TransaccionController {

    private final TransaccionService transaccionService;

    public TransaccionController(TransaccionService transaccionService) {
        this.transaccionService = transaccionService;
    }

    @PostMapping
    public ResponseEntity<Transaccion> crearTransaccion(@RequestBody TransacctionRequestDTO transaccion) {
        try {
            Transaccion nueva = transaccionService.guardar(transaccion);
            return ResponseEntity.ok(nueva);
        } catch (Exception e) {
            return ResponseEntity.unprocessableEntity().body(new Transaccion());
        }
    }
}
