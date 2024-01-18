package com.devlucasmart.academia.service;

import com.devlucasmart.academia.dto.matricula.request.MatriculaRequest;
import com.devlucasmart.academia.dto.matricula.response.MatriculaResponse;

import java.util.List;

public interface IMatriculaService {
    MatriculaResponse create(MatriculaRequest request);

    MatriculaResponse getById(Long id);

    List<MatriculaResponse> getAll();

    void delete(Long id);
}
