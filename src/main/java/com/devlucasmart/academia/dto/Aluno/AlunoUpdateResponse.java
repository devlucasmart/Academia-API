package com.devlucasmart.academia.dto.Aluno;

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
