package com.devlucasmart.academia.dto.aluno.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoUpdateRequest {
    private String nome;
    private String bairro;
    private LocalDate dataDeNascimento;
}
