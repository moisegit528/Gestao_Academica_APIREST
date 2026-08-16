package com.moisegit528.Gestao_Academica.Service;


import com.moisegit528.Gestao_Academica.Dto.request.AlunoRequest;
import com.moisegit528.Gestao_Academica.Dto.response.AlunoResponse;
import com.moisegit528.Gestao_Academica.Mapstruct.AlunoMapper;
import com.moisegit528.Gestao_Academica.Model.AlunoEntity;
import com.moisegit528.Gestao_Academica.Repository.AlunoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoService {

    private final AlunoRepository alunoRepository;
    private final AlunoMapper alunoMapper;

    // POST - creates a student in the repository
    public void createAluno(AlunoRequest requestAluno) {
        alunoRepository.save(alunoMapper.entityAluno(requestAluno));//the requisition and converted for entity with "alunoMapper", shortly after and save in "alunoRepository".
    }

    // GET - search for all student
    public List<AlunoResponse> listAlunos(){
        return alunoMapper.listaResponse(alunoRepository.findAll());// search in "AlunoRepository", shortly after return "listResponse".
    }

    // GET - search by e-mail
    public AlunoResponse findByEmail(String email){
        return alunoMapper.responseAluno(alunoRepository.findByEmail(email));
    }

}
