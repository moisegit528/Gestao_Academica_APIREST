package com.moisegit528.Gestao_Academica.Repository;

import com.moisegit528.Gestao_Academica.Model.CursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface CursoRepository extends JpaRepository<CursoEntity, UUID> {
    Optional<CursoEntity> findBynomeCurso(String nomeCurso);
    //retornar nome, descrição, carga horária e status na busca desse curso.
}
