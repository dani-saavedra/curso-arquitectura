package co.edu.unisabana.cursoarquitectura.pruebas.endpoint.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TransacctionRequestDTO {
    private String cuentaOrigen;
    private String cuentaDestino;
    private BigDecimal monto;
}
