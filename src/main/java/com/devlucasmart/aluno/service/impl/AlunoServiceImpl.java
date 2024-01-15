package com.devlucasmart.aluno.service.impl;

import com.devlucasmart.aluno.model.Aluno;
import com.devlucasmart.aluno.model.form.AlunoForm;
import com.devlucasmart.aluno.model.form.AlunoUpdateForm;
import com.devlucasmart.aluno.repository.AlunoRepository;
import com.devlucasmart.aluno.service.IAlunoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoServiceImpl implements IAlunoService {

    private final AlunoRepository repository;

    @Override
    public Aluno create(AlunoForm form) {
        var aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());

        return repository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll() {
        return repository.findAll();
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
