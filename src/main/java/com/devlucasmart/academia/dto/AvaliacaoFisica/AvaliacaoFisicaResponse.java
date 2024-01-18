package com.devlucasmart.academia.dto.AvaliacaoFisica;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaResponse {
    @NotNull
    private Long alunoId;
    private double peso;
    private double altura;
}
