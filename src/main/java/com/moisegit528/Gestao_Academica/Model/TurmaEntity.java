package com.moisegit528.Gestao_Academica.Model;


import jakarta.persistence.*;
import lombok.*;

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
    private String codigoTurma;
    private Integer semestre;

    @ManyToOne
    @JoinColumn(name = "disciplina_da_turma")
    private DisciplinaEntity disciplina;
}
