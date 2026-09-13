package com.moisegit528.Gestao_Academica.Service;

import com.moisegit528.Gestao_Academica.Dto.request.AvaliacaoRequest;
import com.moisegit528.Gestao_Academica.Dto.response.AvaliacaoResponse;
import com.moisegit528.Gestao_Academica.Exception.NotFoundException;
import com.moisegit528.Gestao_Academica.Mapstruct.AvaliacaoMapper;
import com.moisegit528.Gestao_Academica.Model.AvaliacaoEntity;
import com.moisegit528.Gestao_Academica.Repository.AvaliacaoRepository;
import com.moisegit528.Gestao_Academica.Repository.TurmaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AvaliacaoService {

    final AvaliacaoRepository avaliacaoRepository;
    final AvaliacaoMapper avaliacaoMapper;
    final TurmaRepository turmaRepository;

    // POST - create assessment
    void createAssessment(AvaliacaoRequest requestAvaliacao) {
        avaliacaoRepository.save(avaliacaoMapper.avaliacaoEntity(requestAvaliacao));
    }
    //GET - list all reviews
    List<AvaliacaoResponse> listResponse(List<AvaliacaoEntity> list) {
        return avaliacaoMapper.avaliacaoResponse(list);
    }
    // GET - list evaluations by class
    List<AvaliacaoResponse> findByTurma(Integer codigoTurma) throws NotFoundException {
        List<AvaliacaoEntity> searchClass = avaliacaoRepository.findByTurma_CodigoTurma(codigoTurma)
                .orElseThrow(()-> new NotFoundException("Turma não encontrada!"));
        return avaliacaoMapper.avaliacaoResponse(searchClass);
    }
}
