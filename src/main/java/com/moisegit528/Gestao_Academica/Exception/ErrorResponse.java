package com.moisegit528.Gestao_Academica.Exception;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ErrorResponse {

    private String message;
    private int status;
}
