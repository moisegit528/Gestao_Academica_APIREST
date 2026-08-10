package com.moisegit528.Gestao_Academica.Dto.response;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class TurmaResponse {

    private Integer codigoTurma;
    private Integer semestre;
}
