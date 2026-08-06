package com.moisegit528.Gestao_Academica.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity(name = "aluno_curso")
public class AlunoCursoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private LocalDate dataInicio;
    private LocalDate dataConclusao;
    private boolean status;

    @ManyToOne
    private AlunoEntity aluno;

    @ManyToOne
    private CursoEntity curso;
}
