package com.moisegit528.Gestao_Academica.Model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity(name = "aluno")
public class AlunoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;
    @CreationTimestamp
    private LocalDate dataMatricula;
    private boolean status;

    @OneToOne
    @JoinColumn(name = "curso_id")
    private  CursoEntity curso;

    @OneToMany(mappedBy = "aluno")
    private Set<MatriculaEntity> matriculas = new HashSet<>();
}
