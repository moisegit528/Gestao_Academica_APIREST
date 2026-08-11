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
public class MatriculaRequest {

    @JsonProperty(required = true)
    private Integer numeroMatricula;
    @JsonProperty(required = true)
    private LocalDate dataMatricula;
    @JsonProperty(required = true)
    private boolean statusMatricula;
}
