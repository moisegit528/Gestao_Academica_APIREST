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
public class AlunoRequest {

    @JsonProperty(required = true)
    private String nome;
    @JsonProperty(required = true)
    private String email;
    @JsonProperty(required = true)
    private String telefone;
    @JsonProperty(required = true)
    private LocalDate dataNascimento;
}
