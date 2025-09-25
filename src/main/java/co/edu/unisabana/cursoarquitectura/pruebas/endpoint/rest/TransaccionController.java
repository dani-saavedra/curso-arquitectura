package co.edu.unisabana.cursoarquitectura.pruebas.endpoint.rest;


import co.edu.unisabana.cursoarquitectura.pruebas.endpoint.dto.TransacctionRequestDTO;
import co.edu.unisabana.cursoarquitectura.pruebas.entity.Transaccion;
import co.edu.unisabana.cursoarquitectura.pruebas.service.TransaccionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public ResponseEntity<List<Transaccion>> obtenerTodas() {
        List<Transaccion> transacciones = transaccionService.obtenerTodas();
        return ResponseEntity.ok(transacciones);
    }
}
