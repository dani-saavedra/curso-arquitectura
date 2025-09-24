package co.edu.unisabana.cursoarquitectura.integration;

import co.edu.unisabana.cursoarquitectura.pruebas.Transaccion;
import co.edu.unisabana.cursoarquitectura.pruebas.TransaccionRepository;
import co.edu.unisabana.cursoarquitectura.pruebas.TransacctionRequestDTO;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;


import java.math.BigDecimal;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class TransaccionControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private TransaccionRepository transaccionRepository;

    @Test
    void cuandoSeCreaUnaTransaccion_valoresValidos_entoncesSeGuardaEnBD() {
        // Crear DTO
        TransacctionRequestDTO dto = new TransacctionRequestDTO();
        dto.setCuentaOrigen("123456");
        dto.setCuentaDestino("987654");
        dto.setMonto(new BigDecimal("999.50"));

        ResponseEntity<Transaccion> response = restTemplate.postForEntity(
                "/api/transaccion",
                dto,
                Transaccion.class
        );
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody().getId()).isNotNull();
        assertThat(response.getBody().getMonto()).isEqualByComparingTo("999.50");

        assertThat(transaccionRepository.findAll()).hasSize(1);
    }
}
