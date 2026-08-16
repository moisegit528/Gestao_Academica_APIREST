package com.moisegit528.Gestao_Academica.Repository;

import com.moisegit528.Gestao_Academica.Model.AlunoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AlunoRepository extends JpaRepository<AlunoEntity, UUID> {
    AlunoEntity findByEmail(String email);
    //retornar email, data e status da matricula.
}
