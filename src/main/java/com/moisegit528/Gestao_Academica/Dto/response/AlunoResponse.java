package com.moisegit528.Gestao_Academica.Dto.response;


import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class AlunoResponse {

    private String nome;
    private LocalDate dataMatricula;
    private boolean statusMatricula;
}
