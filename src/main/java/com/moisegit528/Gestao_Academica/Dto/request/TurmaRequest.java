package com.moisegit528.Gestao_Academica.Dto.request;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TurmaRequest {

    @NotBlank
    private Integer codigoTurma;
    @NotBlank
    private Integer semestre;
}
