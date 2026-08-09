package com.moisegit528.Gestao_Academica.Repository;

import com.moisegit528.Gestao_Academica.Model.MatriculaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface MatriculaRepository extends JpaRepository<MatriculaEntity, UUID> {
    Optional<MatriculaEntity> findBynumeroMatricula(Integer numeroMatricula);
    // retornar numero, data e status dessa matricula.
}
