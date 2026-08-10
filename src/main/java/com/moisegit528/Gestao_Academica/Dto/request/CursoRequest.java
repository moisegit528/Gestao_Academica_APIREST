package com.moisegit528.Gestao_Academica.Dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CursoRequest {

    @NotBlank
    private String nomeCurso;
    @NotBlank
    private String descricao;
    @NotBlank
    private Integer cargaHorariaTotal;
}
