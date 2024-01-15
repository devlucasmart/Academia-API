package com.devlucasmart.aluno.service.impl;

import com.devlucasmart.aluno.model.Matricula;
import com.devlucasmart.aluno.model.form.MatriculaForm;
import com.devlucasmart.aluno.repository.AlunoRepository;
import com.devlucasmart.aluno.repository.MatriculaRepository;
import com.devlucasmart.aluno.service.IMatriculaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MatriculaServiceImpl implements IMatriculaService {
    private final MatriculaRepository repository;
    private final AlunoRepository alunoRepository;

    @Override
    public Matricula create(MatriculaForm form) {
        var aluno = alunoRepository.getById(form.getAlunoId());
        var matricula = new Matricula();
        matricula.setAluno(aluno);

        return repository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        return null;
    }

    @Override
    public List<Matricula> getAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
