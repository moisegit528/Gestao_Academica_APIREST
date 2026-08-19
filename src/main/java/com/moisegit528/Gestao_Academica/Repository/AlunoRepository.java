package com.moisegit528.Gestao_Academica.Repository;

import com.moisegit528.Gestao_Academica.Dto.request.AlunoUpdateRequest;
import com.moisegit528.Gestao_Academica.Model.AlunoEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AlunoRepository extends JpaRepository<AlunoEntity, UUID> {
    Optional<AlunoEntity> findByEmail(String email);
    //retornar email, data e status da matricula.
    @Transactional
    Optional<AlunoEntity> deleteByEmail(String email);
}

