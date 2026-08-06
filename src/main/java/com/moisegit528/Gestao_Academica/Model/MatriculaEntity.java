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
@Entity(name = "matricula")
public class MatriculaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private LocalDate dataMatricula;
    private boolean statusMatricula;
    private double notaFinal;

    @ManyToOne
    @JoinColumn(name = "aluno_matricula")
    private AlunoEntity aluno;
}
