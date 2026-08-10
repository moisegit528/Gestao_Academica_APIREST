package com.moisegit528.Gestao_Academica.Dto.response;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CursoResponse {

    private String nomeCurso;
    private String descricao;
    private Integer cargaHorariaTotal;
    private boolean statusCurso; // locked, progress and completed.
}
