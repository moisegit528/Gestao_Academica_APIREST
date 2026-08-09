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
    private Integer ano;

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private ProfessorEntity professor;

    @ManyToOne
    @JoinColumn(name = "disciplina_id")
    private DisciplinaEntity disciplina;
}
