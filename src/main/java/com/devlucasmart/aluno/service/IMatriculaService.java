package com.devlucasmart.aluno.service;

import com.devlucasmart.aluno.model.Matricula;
import com.devlucasmart.aluno.model.form.MatriculaForm;

import java.util.List;

public interface IMatriculaService {
    Matricula create (MatriculaForm form);

    Matricula get(Long id);

    List<Matricula> getAll();

    void delete(Long id);
}
