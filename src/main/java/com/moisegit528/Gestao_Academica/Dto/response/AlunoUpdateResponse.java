package com.moisegit528.Gestao_Academica.Dto.response;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Data
public class AlunoUpdateResponse {

    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataNascimento;
}
