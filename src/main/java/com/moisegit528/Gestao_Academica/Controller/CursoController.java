package com.moisegit528.Gestao_Academica.Controller;

import com.moisegit528.Gestao_Academica.Dto.request.CursoRequest;
import com.moisegit528.Gestao_Academica.Dto.response.CursoResponse;
import com.moisegit528.Gestao_Academica.Exception.NotFoundException;
import com.moisegit528.Gestao_Academica.Service.CursoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/curso")
public class CursoController {

    private final CursoService cursoService;

    @PostMapping
    public void create(@RequestBody CursoRequest cursoRequest) {
        cursoService.create(cursoRequest);
    }

    @GetMapping("/{nomeCurso}")
    public CursoResponse findByNomeCurso(@PathVariable String nomeCurso) throws NotFoundException {
        return cursoService.findByNomeCurso(nomeCurso);
    }
}
