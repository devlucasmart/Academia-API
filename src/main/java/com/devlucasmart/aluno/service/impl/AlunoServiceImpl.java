package com.devlucasmart.aluno.service.impl;

import com.devlucasmart.aluno.dto.Aluno.AlunoAvaliacoesResponse;
import com.devlucasmart.aluno.dto.Aluno.AlunoRequest;
import com.devlucasmart.aluno.dto.Aluno.AlunoResponse;
import com.devlucasmart.aluno.dto.Aluno.AlunoUpdateRequest;
import com.devlucasmart.aluno.dto.Aluno.AlunoUpdateResponse;
import com.devlucasmart.aluno.mappers.AlunoAvaliacoesMapper;
import com.devlucasmart.aluno.mappers.AlunoMapper;
import com.devlucasmart.aluno.mappers.AlunoUpdateMapper;
import com.devlucasmart.aluno.repository.AlunoRepository;
import com.devlucasmart.aluno.service.IAlunoService;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AlunoServiceImpl implements IAlunoService {
    private final AlunoRepository repository;
    private AlunoMapper AlunoMapper = Mappers.getMapper(AlunoMapper.class);
    private AlunoAvaliacoesMapper AlunoAvaliacoesMapper = Mappers.getMapper(AlunoAvaliacoesMapper.class);
    private AlunoUpdateMapper AlunoUpdateMapper = Mappers.getMapper(AlunoUpdateMapper.class);

    @Override
    public AlunoResponse create(AlunoRequest alunoRequest) {
        var alunoResponse = AlunoMapper.toResponse(alunoRequest);
        var aluno = AlunoMapper.toDomain(alunoResponse);
        repository.save(aluno);
        return alunoResponse;
    }

    @Override
    public AlunoResponse get(Long id) {
        var aluno = repository.getById(id);
        var alunoResponse = AlunoMapper.toDtoResponse(aluno);
        return alunoResponse;
    }

    @Override
    public List<AlunoResponse> getAll() {
        var alunos = repository.findAll();
        var alunosList = new ArrayList<AlunoResponse>();
        alunos.forEach(aluno -> alunosList.add(AlunoMapper.toDtoResponse(aluno)));
        return alunosList;
    }

    @Override
    public List<AlunoAvaliacoesResponse> getAllAvaliacaoFisica(Long id) {
        var aluno = repository.getById(id);
        var alunoResponse = AlunoAvaliacoesMapper.toDto(aluno);
        return List.of(alunoResponse);
    }

    @Override
    public AlunoUpdateResponse update(Long id, AlunoUpdateRequest request) {
        var alunoExistente = repository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não existe"));
        BeanUtils.copyProperties(request, alunoExistente);
        var alunoUpdate = repository.save(alunoExistente);
        return AlunoUpdateMapper.toResponse(alunoUpdate);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
