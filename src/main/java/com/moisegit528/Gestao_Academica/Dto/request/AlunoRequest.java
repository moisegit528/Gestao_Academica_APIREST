package com.moisegit528.Gestao_Academica.Dto.request;


import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class AlunoRequest {

    @NotBlank
    private String nome;
    @NotBlank
    private String email;
    @NotBlank
    private String telefone;
    @NotBlank
    private LocalDate dataNascimento;
}
