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
@Entity(name = "turma")
public class TurmaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NotBlank
    private Integer codigoTurma;
    @NotBlank
    private Integer semestre;

    @ManyToOne
    @JoinColumn(name = "disciplina_id")
    private DisciplinaEntity disciplina;

    @OneToMany(mappedBy = "turma")
    private Set<MatriculaEntity> matricula = new HashSet<>();

    @OneToMany(mappedBy = "turma")
    private Set<AvaliacaoEntity>  avaliacao = new HashSet<>();
}
