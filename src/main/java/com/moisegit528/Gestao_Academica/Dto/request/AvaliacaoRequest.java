package com.moisegit528.Gestao_Academica.Dto.request;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class AvaliacaoRequest {

    @JsonProperty(required = true)
    @NotBlank
    private String nomeAvaliacao; // mathematics, Portuguese, physics.
    @JsonProperty(required = true)
    @NotBlank
    private double notaParcial; // score for each evaluation.
    @JsonProperty(required = true)
    @NotBlank
    private LocalDate dataAplicacao; // the day the assessment war or will be administered.
}
