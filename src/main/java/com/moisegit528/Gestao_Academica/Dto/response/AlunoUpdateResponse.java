package com.moisegit528.Gestao_Academica.Dto.response;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class AlunoUpdateResponse {

    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;
}
