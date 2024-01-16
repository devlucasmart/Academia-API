package com.devlucasmart.aluno.service;

import com.devlucasmart.aluno.dto.Aluno.AlunoAvaliacoesResponse;
import com.devlucasmart.aluno.dto.Aluno.AlunoRequest;
import com.devlucasmart.aluno.dto.Aluno.AlunoResponse;
import com.devlucasmart.aluno.dto.Aluno.AlunoUpdateRequest;
import com.devlucasmart.aluno.dto.Aluno.AlunoUpdateResponse;
import com.devlucasmart.aluno.dto.AvaliacaoFisica.AvaliacaoFisicaResponse;

import java.util.List;

public interface IAlunoService {

    AlunoResponse create(AlunoRequest request);

    AlunoResponse get(Long id);

    List<AlunoResponse> getAll();

    List<AlunoAvaliacoesResponse> getAllAvaliacaoFisica(Long id);

    AlunoUpdateResponse update(Long id, AlunoUpdateRequest requestUpdate);

    void delete(Long id);
}
