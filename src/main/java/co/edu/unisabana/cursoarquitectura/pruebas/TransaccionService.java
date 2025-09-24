package co.edu.unisabana.cursoarquitectura.pruebas;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class TransaccionService {

    private final TransaccionRepository transaccionRepository;

    public TransaccionService(TransaccionRepository transaccionRepository) {
        this.transaccionRepository = transaccionRepository;
    }

    public Transaccion guardar(TransacctionRequestDTO transaccionDTO) {
        BigDecimal limite = new BigDecimal("1000");
        if (transaccionDTO.getMonto().compareTo(limite) > 0) {
            throw new IllegalArgumentException("El monto máximo por transacción es 1,000.");
        }
        if (transaccionDTO.getCuentaOrigen().equals(transaccionDTO.getCuentaDestino())) {
            throw new IllegalArgumentException("La cuenta origen y destino no pueden ser iguales.");
        }
        Transaccion transaccion = new Transaccion();
        transaccion.setFecha(LocalDateTime.now());
        transaccion.setMonto(transaccionDTO.getMonto());
        transaccion.setCuentaOrigen(transaccionDTO.getCuentaOrigen());
        transaccion.setCuentaDestino(transaccionDTO.getCuentaDestino());
        return transaccionRepository.save(transaccion);
    }

    public List<Transaccion> obtenerTodas() {
        return transaccionRepository.findAll();
    }
}