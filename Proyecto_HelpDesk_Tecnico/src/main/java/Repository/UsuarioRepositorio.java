package Repository;

import Entities.UsuarioGeneral;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepositorio extends JpaRepository<UsuarioGeneral, Long> {
    @Transactional
    Optional<UsuarioGeneral> findByUse_nom_ap(String Use_nom_ap);
}
