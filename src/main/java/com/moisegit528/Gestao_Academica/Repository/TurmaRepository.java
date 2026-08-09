package com.moisegit528.Gestao_Academica.Repository;

import com.moisegit528.Gestao_Academica.Model.TurmaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface TurmaRepository extends JpaRepository<TurmaEntity, Integer> {
    Optional<TurmaEntity> findBycodigoTurma(Integer codigoTurma);
    // retornar codigo e semestre da turma.
}
