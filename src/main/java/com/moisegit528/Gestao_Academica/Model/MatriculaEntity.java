package com.moisegit528.Gestao_Academica.Model;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
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
    private Integer numeroMatricula;
    private LocalDate dataMatricula;
    private boolean statusMatricula; // locked, progress and completed.
    private double notaFinal;

    @ManyToOne
    @JoinColumn(name = "turma_id")
    private TurmaEntity turma;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private AlunoEntity aluno;

    @OneToMany(mappedBy = "matricula")
    private Set<NotaEntity> notasAluno = new HashSet<>();
}
