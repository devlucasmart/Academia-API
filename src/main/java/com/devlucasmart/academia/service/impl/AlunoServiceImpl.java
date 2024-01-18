package com.devlucasmart.academia.service.impl;

import com.devlucasmart.academia.dto.aluno.request.AlunoRequest;
import com.devlucasmart.academia.dto.aluno.request.AlunoUpdateRequest;
import com.devlucasmart.academia.dto.aluno.response.AlunoAvaliacoesResponse;
import com.devlucasmart.academia.dto.aluno.response.AlunoResponse;
import com.devlucasmart.academia.dto.aluno.response.AlunoUpdateResponse;
import com.devlucasmart.academia.mappers.AlunoAvaliacoesMapper;
import com.devlucasmart.academia.mappers.AlunoMapper;
import com.devlucasmart.academia.mappers.AlunoUpdateMapper;
import com.devlucasmart.academia.repository.AlunoRepository;
import com.devlucasmart.academia.service.IAlunoService;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AlunoServiceImpl implements IAlunoService {
    private final AlunoRepository repository;
    private AlunoMapper alunoMapper = Mappers.getMapper(AlunoMapper.class);
    private AlunoAvaliacoesMapper alunoAvaliacoesMapper = Mappers.getMapper(AlunoAvaliacoesMapper.class);
    private AlunoUpdateMapper alunoUpdateMapper = Mappers.getMapper(AlunoUpdateMapper.class);

    @Override
    public AlunoResponse create(AlunoRequest alunoRequest) {
        var aluno = alunoMapper.toDomain(alunoRequest);
        var alunoResponse = alunoMapper.toDtoResponse(aluno);
        repository.save(aluno);
        return alunoResponse;
    }

    @Override
    public AlunoResponse get(Long id) {
        var aluno = repository.getById(id);
        var alunoResponse = alunoMapper.toDtoResponse(aluno);
        alunoResponse.setId(aluno.getId());
        return alunoResponse;
    }

    @Override
    public List<AlunoResponse> getAll() {
        return repository.findAll().stream()
                .map(aluno -> {
                    var alunoResponse = alunoMapper.toDtoResponse(aluno);
                    alunoResponse.setId(aluno.getId());
                    return alunoResponse;
                })
                .collect(Collectors.toList());
    }

    @Override
    public List<AlunoAvaliacoesResponse> getAllAvaliacaoFisica(Long id) {
        var aluno = repository.getById(id);
        var alunoAvaliacaoResponse = alunoAvaliacoesMapper.toDto(aluno);
        return List.of(alunoAvaliacaoResponse);
    }

    @Override
    public AlunoUpdateResponse update(Long id, AlunoUpdateRequest request) {
        var alunoExistente = repository.findById(id).orElseThrow(() -> new RuntimeException("Aluno não existe"));
        BeanUtils.copyProperties(request, alunoExistente);
        var alunoUpdate = repository.save(alunoExistente);
        return alunoUpdateMapper.toResponse(alunoUpdate);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
