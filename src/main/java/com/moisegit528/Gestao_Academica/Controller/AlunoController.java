package com.moisegit528.Gestao_Academica.Controller;

import com.moisegit528.Gestao_Academica.Dto.request.AlunoRequest;
import com.moisegit528.Gestao_Academica.Dto.response.AlunoResponse;
import com.moisegit528.Gestao_Academica.Mapstruct.AlunoMapper;
import com.moisegit528.Gestao_Academica.Repository.AlunoRepository;
import com.moisegit528.Gestao_Academica.Service.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/aluno")
public class AlunoController {

    private final AlunoRepository alunoRepository;
    private final AlunoService alunoService;
    private final AlunoMapper alunoMapper;

    @PostMapping
    public void createAluno(@RequestBody AlunoRequest alunoRequest) {
        alunoService.createAluno(alunoRequest);
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<AlunoResponse> listAlunos() {
        return alunoService.listAlunos();
    }
}
