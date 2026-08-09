package com.moisegit528.Gestao_Academica.Repository;

import com.moisegit528.Gestao_Academica.Model.AvaliacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AvaliacaoRepository extends JpaRepository<AvaliacaoEntity, UUID> {
    Optional<AvaliacaoEntity> findBynomeAvaliacao(String nomeAvaliacao);
    // retornar nome, notaParcial e data dessa avaliacao.
}
