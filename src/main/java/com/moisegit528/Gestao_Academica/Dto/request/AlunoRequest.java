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
    @NotBlank
    private String nome;
    @JsonProperty(required = true)
    @NotBlank
    private String email;
    @JsonProperty(required = true)
    @NotBlank
    private String telefone;
    @JsonProperty(required = true)
    @NotBlank
    private LocalDate dataNascimento;
}
