package com.moisegit528.Gestao_Academica.Repository;

import com.moisegit528.Gestao_Academica.Model.DisciplinaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface DisciplinaRepository extends JpaRepository<DisciplinaEntity, UUID> {
    Optional<DisciplinaEntity> findBynomeDisciplina(String nomeDisciplina);
    // retornar nome, código e carga horária da disciplina, na busca.
}
