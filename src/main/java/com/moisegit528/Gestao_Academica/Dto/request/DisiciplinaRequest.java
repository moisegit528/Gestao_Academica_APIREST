package com.moisegit528.Gestao_Academica.Dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DisiciplinaRequest {

    @NotBlank
    private String nomeDisciplina;
    @NotBlank
    private String codigoDisciplina; //cada disciplina um código especifico(matematica: 1, inglês: 2 etc...)
    @NotBlank
    private Integer cargaHoraria;
}
