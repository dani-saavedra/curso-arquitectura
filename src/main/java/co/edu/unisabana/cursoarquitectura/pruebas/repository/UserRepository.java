package co.edu.unisabana.cursoarquitectura.pruebas.repository;

import co.edu.unisabana.cursoarquitectura.pruebas.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}