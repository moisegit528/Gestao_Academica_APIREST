package com.moisegit528.Gestao_Academica.Dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CursoRequest {

    @JsonProperty(required = true)
    private String nomeCurso;
    @JsonProperty(required = true)
    private String descricao;
    @JsonProperty(required = true)
    private Integer cargaHorariaTotal;
}
