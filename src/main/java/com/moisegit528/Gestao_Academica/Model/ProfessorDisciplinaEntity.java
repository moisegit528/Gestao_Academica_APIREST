package com.moisegit528.Gestao_Academica.Model;


import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity(name = "professor_disciplina")
public class ProfessorDisciplinaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Integer semestre;

    @ManyToOne
    private DisciplinaEntity disciplina;

    @ManyToOne
    private ProfessorEntity professor;
}
