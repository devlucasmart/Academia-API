package com.devlucasmart.academia.service;

import com.devlucasmart.academia.dto.aluno.response.AlunoAvaliacoesResponse;
import com.devlucasmart.academia.dto.aluno.request.AlunoRequest;
import com.devlucasmart.academia.dto.aluno.response.AlunoResponse;
import com.devlucasmart.academia.dto.aluno.request.AlunoUpdateRequest;
import com.devlucasmart.academia.dto.aluno.response.AlunoUpdateResponse;

import java.util.List;

public interface IAlunoService {

    AlunoResponse create(AlunoRequest request);

    AlunoResponse get(Long id);

    List<AlunoResponse> getAll();

    List<AlunoAvaliacoesResponse> getAllAvaliacaoFisica(Long id);

    AlunoUpdateResponse update(Long id, AlunoUpdateRequest requestUpdate);

    void delete(Long id);
}
