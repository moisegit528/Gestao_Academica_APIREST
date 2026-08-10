package com.moisegit528.Gestao_Academica.Dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ProfessorRequest {

    @NotBlank
    private String nome;
    @NotBlank
    private String email;
    @NotBlank
    private String telefone;
    @NotBlank
    private String materia; // qual a materia o professor ensina.
}
