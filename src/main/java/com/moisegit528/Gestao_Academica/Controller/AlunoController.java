package com.moisegit528.Gestao_Academica.Controller;


import com.moisegit528.Gestao_Academica.Dto.request.AlunoRequest;
import com.moisegit528.Gestao_Academica.Mapstruct.AlunoMapper;
import com.moisegit528.Gestao_Academica.Repository.AlunoRepository;
import com.moisegit528.Gestao_Academica.Service.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/aluno")
public class AlunoController {

    private final AlunoService alunoService;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void createAluno(@RequestBody AlunoRequest alunoRequest){
        alunoService.createAluno(alunoRequest);
    }
}
