package com.moisegit528.Gestao_Academica.Dto.request;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TurmaRequest {

    @JsonProperty(required = true)
    private Integer codigoTurma;
    @JsonProperty(required = true)
    private Integer semestre;
}
