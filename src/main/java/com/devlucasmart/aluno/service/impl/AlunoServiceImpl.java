package com.devlucasmart.aluno.service.impl;

import com.devlucasmart.aluno.mappers.AlunoMapper;
import com.devlucasmart.aluno.mappers.AlunoUpdateMapper;
import com.devlucasmart.aluno.model.Aluno;
import com.devlucasmart.aluno.model.form.AlunoForm;
import com.devlucasmart.aluno.model.form.AlunoUpdateForm;
import com.devlucasmart.aluno.repository.AlunoRepository;
import com.devlucasmart.aluno.service.IAlunoService;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoServiceImpl implements IAlunoService {

    private final AlunoRepository repository;

    private AlunoMapper AlunoMapper = Mappers.getMapper(AlunoMapper.class);
    private AlunoUpdateMapper AlunoUpdateMapper = Mappers.getMapper(AlunoUpdateMapper.class);

    @Override
    public Aluno create(AlunoForm form) {
        var aluno = AlunoMapper.toDomain(form);
        return repository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return repository.getById(id);
    }

    @Override
    public List<AlunoForm> getAll() {
        var alunos = repository.findAll();
        var alunosList = new ArrayList<AlunoForm>();
        alunos.forEach(aluno -> alunosList.add(AlunoMapper.toDto(aluno)));
        return alunosList;
    }

    @Override
    public AlunoUpdateForm update(Long id, AlunoUpdateForm formUpdate) {
        formUpdate.setId(id);
        var aluno = AlunoUpdateMapper.toDomain(formUpdate);
        aluno = repository.save(aluno);
        return AlunoUpdateMapper.toDto(aluno);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
