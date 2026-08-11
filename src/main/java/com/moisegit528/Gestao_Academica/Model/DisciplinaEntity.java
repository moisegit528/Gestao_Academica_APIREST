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
@Entity(name = "disciplina")
public class DisciplinaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NotBlank
    private String nomeDisciplina;//mostrar nome, código e carga horária da disciplina, na busca.
    @NotBlank
    private String codigoDisciplina; //cada disciplina um código especifico(matematica: 1, inglês: 2 etc...)
    @NotBlank
    private Integer cargaHoraria;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private CursoEntity curso;

    @OneToMany(mappedBy = "disciplina")
    private Set<ProfessorDisciplinaEntity> professorDisciplina = new HashSet<>();

    @OneToMany(mappedBy = "disciplina")
    private Set<TurmaEntity> turma = new HashSet<>();
}
