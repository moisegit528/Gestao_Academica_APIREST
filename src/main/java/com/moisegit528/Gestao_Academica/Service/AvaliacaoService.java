package com.moisegit528.Gestao_Academica.Service;

import com.moisegit528.Gestao_Academica.Dto.request.AvaliacaoRequest;
import com.moisegit528.Gestao_Academica.Dto.response.AlunoResponse;
import com.moisegit528.Gestao_Academica.Dto.response.AvaliacaoResponse;
import com.moisegit528.Gestao_Academica.Mapstruct.AvaliacaoMapper;
import com.moisegit528.Gestao_Academica.Model.AlunoEntity;
import com.moisegit528.Gestao_Academica.Model.TurmaEntity;
import com.moisegit528.Gestao_Academica.Repository.AvaliacaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AvaliacaoService {

    final AvaliacaoRepository avaliacaoRepository;
    final AvaliacaoMapper avaliacaoMapper;

    // POST - create assessment
    void createAssessment(AvaliacaoRequest requestAvaliacao) {
        avaliacaoRepository.save(avaliacaoMapper.avaliacaoEntity(requestAvaliacao));
    }
    //GET - list all reviews
    List<AlunoResponse> listResponse(List<AlunoEntity> listEntity) {
        return avaliacaoMapper.listResponse(listEntity);
    }
    // GET - list evaluations by class
    List<AvaliacaoResponse> findByTurma(TurmaEntity entity,  Integer codigoTurma) {
        return avaliacaoMapper.alunoResponse()
    }
}
