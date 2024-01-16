package com.devlucasmart.academia.dto.AvaliacaoFisica;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaRequest {
    private Long alunoId;
    private double peso;
    private double altura;
}
