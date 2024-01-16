package com.devlucasmart.academia.service;

import com.devlucasmart.academia.dto.Matricula.MatriculaRequest;
import com.devlucasmart.academia.model.Matricula;

import java.util.List;

public interface IMatriculaService {
    Matricula create(MatriculaRequest request);

    Matricula get(Long id);

    List<Matricula> getAll();

    void delete(Long id);
}
