package co.edu.unisabana.cursoarquitectura.pruebas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "transaccion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String cuentaOrigen;

    @Column
    private String cuentaDestino;

    @Column
    private BigDecimal monto;

    @Column
    private LocalDateTime fecha;

}

