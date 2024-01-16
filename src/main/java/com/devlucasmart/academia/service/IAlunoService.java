package com.devlucasmart.academia.service;

import com.devlucasmart.academia.dto.Aluno.AlunoAvaliacoesResponse;
import com.devlucasmart.academia.dto.Aluno.AlunoRequest;
import com.devlucasmart.academia.dto.Aluno.AlunoResponse;
import com.devlucasmart.academia.dto.Aluno.AlunoUpdateRequest;
import com.devlucasmart.academia.dto.Aluno.AlunoUpdateResponse;

import java.util.List;

public interface IAlunoService {

    AlunoResponse create(AlunoRequest request);

    AlunoResponse get(Long id);

    List<AlunoResponse> getAll();

    List<AlunoAvaliacoesResponse> getAllAvaliacaoFisica(Long id);

    AlunoUpdateResponse update(Long id, AlunoUpdateRequest requestUpdate);

    void delete(Long id);
}
