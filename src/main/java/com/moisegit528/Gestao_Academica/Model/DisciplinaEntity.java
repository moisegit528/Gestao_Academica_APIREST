package com.moisegit528.Gestao_Academica.Model;

import jakarta.persistence.*;
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
    private String nome;
    private String codigoDisciplina; // cada disciplina terá um código especifico (matemtica: 1, inglês: 2 etc...)
    private Integer cargaHoraria;

    @OneToMany(mappedBy = "disciplina")
    private Set<ProfessorDisciplinaEntity> disciplinaeProfessor = new HashSet<>();

    @OneToMany(mappedBy = "disciplina")
    private Set<TurmaEntity>  turma = new HashSet<>();
}
