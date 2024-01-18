package com.devlucasmart.academia.dto.Aluno;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoRequest {
    @NotEmpty(message = "Preencha o campo corretamente")
    @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String nome;
    @NotEmpty(message = "Preencha o campo corretamente.")
    @CPF(message = "'${validatedValue}' é invalido")
    private String cpf;
    @NotEmpty(message = "Preencha o campo corretamente")
    @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
    private String bairro;
    @NotNull(message = "Preencha o campo corretamente")
    @Past(message = "Data '${validatedValue}' é inválida.")
    private LocalDateTime dataDeNascimento;
}
