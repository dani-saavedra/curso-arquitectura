package co.edu.unisabana.cursoarquitectura.pruebas;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BoleteriaControllerTest {


    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    public void test1() {
        ResponseEntity<String> response = testRestTemplate.getForEntity("/boleta/vip?precio=1000", String.class);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertEquals("900.0", response.getBody());
    }

    @Test
    public void testError() {
        ResponseEntity<String> response = testRestTemplate.getForEntity("/boleta/regular?precio=90000", String.class);
        assertEquals(HttpStatus.UNPROCESSABLE_ENTITY, response.getStatusCode());
    }
}