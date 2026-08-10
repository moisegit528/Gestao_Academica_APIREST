package com.moisegit528.Gestao_Academica.Dto.response;


import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class AlunoResponse {

    private String email;
    private LocalDate dataMatricula;
    private boolean statusMatricula;
}
