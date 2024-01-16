package com.devlucasmart.academia.dto.Aluno;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoRequest {
    @NotNull
    private String nome;
    @CPF
    private String cpf;
    @NotNull
    private String bairro;
    @NotNull
    private LocalDateTime dataDeNascimento;
}
