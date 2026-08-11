package com.moisegit528.Gestao_Academica.Dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DisciplinaRequest {

    @JsonProperty(required = true)
    private String nomeDisciplina;
    @JsonProperty(required = true)
    private String codigoDisciplina; //cada disciplina um código especifico(matematica: 1, inglês: 2 etc...)
    @JsonProperty(required = true)
    private Integer cargaHoraria;
}
