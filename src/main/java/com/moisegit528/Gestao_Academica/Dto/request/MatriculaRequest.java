package com.moisegit528.Gestao_Academica.Dto.request;


import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class MatriculaRequest {

    @NotBlank
    private Integer numeroMatricula;
    @NotBlank
    private LocalDate dataMatricula;
    @NotBlank
    private boolean statusMatricula;
}
