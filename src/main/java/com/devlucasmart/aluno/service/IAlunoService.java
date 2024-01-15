package com.devlucasmart.aluno.service;

import com.devlucasmart.aluno.model.Aluno;
import com.devlucasmart.aluno.model.form.AlunoForm;
import com.devlucasmart.aluno.model.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {

    Aluno create(AlunoForm form);

    Aluno get(Long id);

    List<Aluno> getAll();

    Aluno update(Long id, AlunoUpdateForm formUpdate);

    void delete(Long id);
}
