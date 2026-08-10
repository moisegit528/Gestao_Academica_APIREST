package com.moisegit528.Gestao_Academica.Dto.response;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DisciplinaResponse {

    private String nomeDisciplina;
    private String codigoDisciplina;
    private Integer cargaHoraria;
}
