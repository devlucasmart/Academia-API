package com.devlucasmart.aluno.model.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {
    private String nome;
    private String cpf;
    private String bairro;
    private LocalDateTime dataDeNascimento;
}
