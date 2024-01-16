package com.devlucasmart.aluno.dto.AvaliacaoFisica;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaUpdateRequest {
    private double peso;
    private double altura;
}
