package com.moisegit528.Gestao_Academica.Repository;

import com.moisegit528.Gestao_Academica.Model.AvaliacaoEntity;
import com.moisegit528.Gestao_Academica.Model.TurmaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AvaliacaoRepository extends JpaRepository<AvaliacaoEntity, UUID> {
    Optional<AvaliacaoEntity> findByNomeAvaliacao(String nomeAvaliacao);
    // retornar nome, notaParcial e data dessa avaliacao.
    Optional<List<AvaliacaoEntity>> findByTurma_CodigoTurma(Integer codigoTurma);
}
