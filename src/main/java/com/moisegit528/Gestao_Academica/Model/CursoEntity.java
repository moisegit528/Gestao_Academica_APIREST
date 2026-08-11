package com.moisegit528.Gestao_Academica.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity(name = "curso")
public class CursoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NotBlank
    private String nomeCurso;// mostrar nome, descrição e carga horária na busca desse curso.
    @NotBlank
    private String descricao;
    @NotBlank
    private Integer cargaHorariaTotal;
    private boolean statusCurso; // locked, progress and completed.

    @OneToOne
    @JoinColumn(name = "aluno_id")
    private AlunoEntity aluno;

    @OneToMany(mappedBy = "curso")
    private Set<DisciplinaEntity>  disciplina = new HashSet<>();
}
