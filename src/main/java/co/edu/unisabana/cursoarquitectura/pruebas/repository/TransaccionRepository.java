package co.edu.unisabana.cursoarquitectura.pruebas.repository;

import co.edu.unisabana.cursoarquitectura.pruebas.entity.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransaccionRepository extends JpaRepository<Transaccion, Long> {
}
