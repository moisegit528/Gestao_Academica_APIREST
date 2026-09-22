package com.moisegit528.Gestao_Academica.Service;

import com.moisegit528.Gestao_Academica.Dto.request.CursoRequest;
import com.moisegit528.Gestao_Academica.Dto.response.CursoResponse;
import com.moisegit528.Gestao_Academica.Exception.BadRequestException;
import com.moisegit528.Gestao_Academica.Mapstruct.CursoMapper;
import com.moisegit528.Gestao_Academica.Model.CursoEntity;
import com.moisegit528.Gestao_Academica.Repository.CursoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CursoService {

    private final CursoRepository cursoRepository;
    private final CursoMapper cursoMapper;

    // POST - create courses in the repository
    public CursoResponse create(CursoRequest request){
        CursoEntity entity = cursoRepository.findByNomeCurso(request.getNomeCurso())
                        .orElseThrow(() -> new BadRequestException("Esse curso já existe"));
       cursoRepository.save(cursoMapper.toEntity(request));
       return cursoMapper.toResponse(entity); 
    }

    List<CursoResponse> listAll(){
        return cursoMapper.toResponseList(cursoRepository.findAll());
    }

}
