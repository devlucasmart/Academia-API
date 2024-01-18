package com.devlucasmart.academia.dto.aluno.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoUpdateResponse {
    private Long id;
    private String nome;
    private String bairro;
    private LocalDate dataDeNascimento;
}
