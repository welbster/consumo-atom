package me.welbster.consumo_atom.domain.repository;

import me.welbster.consumo_atom.domain.model.Consumo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumoRepository extends JpaRepository<Consumo, Long> {

    boolean existsByNumero(Long numero);

}
