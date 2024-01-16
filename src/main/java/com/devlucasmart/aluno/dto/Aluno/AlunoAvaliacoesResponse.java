package com.devlucasmart.aluno.dto.Aluno;

import com.devlucasmart.aluno.dto.AvaliacaoFisica.AvaliacaoFisicaResponse;
import com.devlucasmart.aluno.model.AvaliacaoFisica;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlunoAvaliacoesResponse {
    private String nome;
    private String cpf;
    private List<AvaliacaoFisicaResponse> avaliacoes = new ArrayList<>();
}
