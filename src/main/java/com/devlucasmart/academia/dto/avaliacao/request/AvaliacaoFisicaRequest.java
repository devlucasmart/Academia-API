package com.devlucasmart.academia.dto.avaliacao.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaRequest {

    @Positive(message = "O Id do aluno precisa ser positivo.")
    private Long alunoId;

    @NotNull(message = "Preencha o campo corretamente.")
    @Positive(message = "'${validatedValue}' precisa ser positivo")
    private double peso;

    @NotNull(message = "Preencha o campo corretamente.")
    @Positive(message = "'${validatedValue}' precisa ser positivo")
    @DecimalMin(value = "1.50", message = "'${validatedValue}' precisa ser no minimo {value}.")
    private double altura;
}
