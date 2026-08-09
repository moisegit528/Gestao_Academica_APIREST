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
@Entity(name = "curso")
public class CursoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    private String descricao;
    private Integer cargaHorariaTotal;
    private boolean status;

    @OneToOne
    @JoinColumn(name = "aluno_id")
    private AlunoEntity aluno;

    @OneToMany(mappedBy = "curso")
    private Set<DisciplinaEntity>  disciplina = new HashSet<>();
}
