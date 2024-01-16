package com.devlucasmart.aluno.service;

import com.devlucasmart.aluno.dto.Matricula.MatriculaRequest;
import com.devlucasmart.aluno.model.Matricula;

import java.util.List;

public interface IMatriculaService {
    Matricula create(MatriculaRequest request);

    Matricula get(Long id);

    List<Matricula> getAll();

    void delete(Long id);
}
