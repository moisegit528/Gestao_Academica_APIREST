package com.moisegit528.Gestao_Academica.Controller;

import com.moisegit528.Gestao_Academica.Dto.request.AlunoRequest;
import com.moisegit528.Gestao_Academica.Dto.response.AlunoResponse;
import com.moisegit528.Gestao_Academica.Exception.NotFoundException;
import com.moisegit528.Gestao_Academica.Service.AlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/aluno")
public class AlunoController {

    private final AlunoService alunoService;

    @PostMapping
    public void createAluno(@RequestBody AlunoRequest alunoRequest) {
        alunoService.createAluno(alunoRequest);
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<AlunoResponse> listAlunos() {
        return alunoService.listAlunos();
    }

    @GetMapping("/{email}")
    @ResponseStatus(HttpStatus.OK)
    public AlunoResponse findByEmail(@PathVariable String email) throws NotFoundException {
        return alunoService.findByEmail(email);
    }

    @DeleteMapping("/delete/{email}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteByEmail(@PathVariable String email) {
        alunoService.deleteByEmail(email);
    }
}
