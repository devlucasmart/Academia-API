package com.devlucasmart.academia.dto.Aluno;

import com.devlucasmart.academia.dto.AvaliacaoFisica.AvaliacaoFisicaResponse;
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
    private Long id;
    private String nome;
    private String cpf;
    private List<AvaliacaoFisicaResponse> avaliacoes = new ArrayList<>();
}
