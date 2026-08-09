package com.moisegit528.Gestao_Academica.Model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity(name = "avaliacao")
public class AvaliacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nomeAvalicao; // matematica, fisica, portugues etc...
    private double nota;
    private LocalDate dataAplicacao; // dia que foi aplicado a avaliacao.

    @ManyToOne
    @JoinColumn(name = "turma_id")
    private TurmaEntity turma;

    @OneToMany(mappedBy = "avaliacao")
    private Set<NotaEntity> notas = new HashSet<>();
}
