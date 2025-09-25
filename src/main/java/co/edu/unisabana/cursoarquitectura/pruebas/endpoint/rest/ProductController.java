package co.edu.unisabana.cursoarquitectura.pruebas.endpoint.rest;

import co.edu.unisabana.cursoarquitectura.pruebas.endpoint.dto.UserDTO;
import co.edu.unisabana.cursoarquitectura.pruebas.entity.User;
import co.edu.unisabana.cursoarquitectura.pruebas.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class ProductController {

    ProductService productService;

    @GetMapping("/users/{id}")
    public User findUser(@PathVariable Long id) {
        return productService.consultarUsuario(id);
    }

    @PostMapping("/user")
    public User crearUsuario(@RequestBody UserDTO userDTO) {
        return productService.crearUsuario(userDTO);
    }
}
