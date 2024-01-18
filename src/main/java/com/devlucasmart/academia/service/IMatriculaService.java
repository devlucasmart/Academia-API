package com.devlucasmart.academia.service;

import com.devlucasmart.academia.dto.Matricula.MatriculaRequest;
import com.devlucasmart.academia.dto.Matricula.MatriculaResponse;

import java.util.List;

public interface IMatriculaService {
    MatriculaResponse create(MatriculaRequest request);

    MatriculaResponse getById(Long id);

    List<MatriculaResponse> getAll();

    void delete(Long id);
}
