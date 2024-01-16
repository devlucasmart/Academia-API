package com.devlucasmart.academia.service.impl;

import com.devlucasmart.academia.dto.Matricula.MatriculaRequest;
import com.devlucasmart.academia.mappers.MatriculaMapper;
import com.devlucasmart.academia.model.Matricula;
import com.devlucasmart.academia.repository.AlunoRepository;
import com.devlucasmart.academia.repository.MatriculaRepository;
import com.devlucasmart.academia.service.IMatriculaService;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MatriculaServiceImpl implements IMatriculaService {
    private final MatriculaRepository repository;
    private final AlunoRepository alunoRepository;

    private MatriculaMapper MatriculaMapper = Mappers.getMapper(MatriculaMapper.class);

    @Override
    public Matricula create(MatriculaRequest request) {
        var aluno = alunoRepository.getById(request.getAlunoId());
        var matricula = MatriculaMapper.toDomain(request);
        matricula.setAluno(aluno);

        return repository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        return repository.getById(id);
    }

    @Override
    public List<Matricula> getAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
