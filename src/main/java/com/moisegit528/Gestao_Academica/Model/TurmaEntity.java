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
@Entity(name = "turma")
public class TurmaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Integer codigoTurma;
    private Integer semestre;

    @ManyToOne
    @JoinColumn(name = "disciplina_id")
    private DisciplinaEntity disciplina;

    @OneToMany(mappedBy = "turma")
    private Set<MatriculaEntity> matricula = new HashSet<>();

    @OneToMany(mappedBy = "turma")
    private Set<AvaliacaoEntity>  avaliacao = new HashSet<>();
}
