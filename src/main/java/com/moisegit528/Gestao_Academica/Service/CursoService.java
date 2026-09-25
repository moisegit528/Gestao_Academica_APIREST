package com.moisegit528.Gestao_Academica.Service;

import com.moisegit528.Gestao_Academica.Dto.request.CursoRequest;
import com.moisegit528.Gestao_Academica.Dto.response.CursoResponse;
import com.moisegit528.Gestao_Academica.Exception.BadRequestException;
import com.moisegit528.Gestao_Academica.Exception.NotFoundException;
import com.moisegit528.Gestao_Academica.Mapstruct.CursoMapper;
import com.moisegit528.Gestao_Academica.Model.CursoEntity;
import com.moisegit528.Gestao_Academica.Repository.CursoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CursoService {

    private final CursoRepository cursoRepository;
    private final CursoMapper cursoMapper;

    // POST - create courses in the repository
    public CursoResponse create(CursoRequest cursoRequest, String nomeCurso) {
        CursoEntity curso = cursoRepository.findByNomeCurso(nomeCurso)
                .orElseThrow(() -> new BadRequestException("Esse curso já existe!"));
        cursoMapper.toResponse(cursoRepository.save(curso));
        return cursoMapper.toResponse(curso);
    }

    // GET - Search for the course by name
    public CursoResponse findByNomeCurso(@PathVariable String nomeCurso) throws NotFoundException {
        CursoEntity entity = cursoRepository.findByNomeCurso(nomeCurso)
                .orElseThrow(() -> new NotFoundException("Curso não encontrado!"));
        return cursoMapper.toResponse(entity);
    }

    List<CursoResponse> listAll(){
        return cursoMapper.toResponseList(cursoRepository.findAll());
    }

}
