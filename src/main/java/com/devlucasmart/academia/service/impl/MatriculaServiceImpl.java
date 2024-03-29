package com.devlucasmart.academia.service.impl;

import com.devlucasmart.academia.dto.matricula.request.MatriculaRequest;
import com.devlucasmart.academia.dto.matricula.response.MatriculaResponse;
import com.devlucasmart.academia.mappers.MatriculaMapper;
import com.devlucasmart.academia.repository.AlunoRepository;
import com.devlucasmart.academia.repository.MatriculaRepository;
import com.devlucasmart.academia.service.IMatriculaService;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MatriculaServiceImpl implements IMatriculaService {
    private final MatriculaRepository repository;
    private final AlunoRepository alunoRepository;

    private MatriculaMapper matriculaMapper = Mappers.getMapper(MatriculaMapper.class);

    @Override
    public MatriculaResponse create(MatriculaRequest request) {
        var aluno = alunoRepository.getById(request.getAlunoId());
        var matricula = matriculaMapper.toDomain(request);
        matricula.setAluno(aluno);
        var matriculaResponse = matriculaMapper.toResponse(request);
        repository.save(matricula);
        return matriculaResponse;
    }

    @Override
    public MatriculaResponse getById(Long id) {
        var matricula = repository.getById(id);
        var matriculaResponse = matriculaMapper.toDtoResponse(matricula);
        matriculaResponse.setAlunoId(matricula.getAluno().getId());
        return matriculaResponse;
    }

    @Override
    public List<MatriculaResponse> getAll() {
        return repository.findAll().stream()
                .map(matricula -> {
                    var matriculaResponse = matriculaMapper.toDtoResponse(matricula);
                    matriculaResponse.setAlunoId(matricula.getAluno().getId());
                    return matriculaResponse;
                })
                .collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
