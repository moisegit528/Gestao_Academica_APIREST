package com.moisegit528.Gestao_Academica.Dto.response;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class AvaliacaoResponse {

    private String nomeAvaliacao; // mathematics, Portuguese, physics.
    private double notaParcial; // score for each evaluation.
    private LocalDate dataAplicacao; // the day the assessment war or will be administered.
}
