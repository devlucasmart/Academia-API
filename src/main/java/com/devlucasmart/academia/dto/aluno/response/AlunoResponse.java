package com.devlucasmart.academia.dto.aluno.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoResponse {
    private Long id;
    private String nome;
    private String cpf;
}
