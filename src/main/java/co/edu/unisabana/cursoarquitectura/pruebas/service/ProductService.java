package co.edu.unisabana.cursoarquitectura.pruebas.service;

import co.edu.unisabana.cursoarquitectura.pruebas.endpoint.dto.UserDTO;
import co.edu.unisabana.cursoarquitectura.pruebas.entity.User;
import co.edu.unisabana.cursoarquitectura.pruebas.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductService {

    private UserRepository repository;

    public User consultarUsuario(Long id) {
        return repository.findById(id).get();
    }

    public User crearUsuario(UserDTO userDTO) {
        User user = new User();
        user.setEmail(userDTO.email());
        user.setName(userDTO.name());
        return repository.save(user);
    }
}
