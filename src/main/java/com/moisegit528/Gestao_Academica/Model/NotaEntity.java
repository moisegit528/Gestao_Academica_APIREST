package com.moisegit528.Gestao_Academica.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity(name = "nota")
public class NotaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @NotBlank
    private double notaFinal;

    @ManyToOne
    @JoinColumn(name = "avaliacao_id")
    private AvaliacaoEntity avaliacao;

    @ManyToOne
    @JoinColumn(name = "matricula_id")
    private MatriculaEntity matricula;
}
