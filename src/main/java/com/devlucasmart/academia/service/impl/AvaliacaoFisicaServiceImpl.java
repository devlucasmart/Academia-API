package com.devlucasmart.academia.service.impl;

import com.devlucasmart.academia.dto.AvaliacaoFisica.AvaliacaoFisicaRequest;
import com.devlucasmart.academia.dto.AvaliacaoFisica.AvaliacaoFisicaResponse;
import com.devlucasmart.academia.dto.AvaliacaoFisica.AvaliacaoFisicaUpdateRequest;
import com.devlucasmart.academia.mappers.AlunoMapper;
import com.devlucasmart.academia.mappers.AlunoUpdateMapper;
import com.devlucasmart.academia.mappers.AvaliacaoFisicaMapper;
import com.devlucasmart.academia.mappers.AvaliacaoFisicaUpdateMapper;
import com.devlucasmart.academia.repository.AlunoRepository;
import com.devlucasmart.academia.repository.AvaliacaoFisicaRepository;
import com.devlucasmart.academia.service.IAvaliacaoFisicaService;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {
    private final AvaliacaoFisicaRepository repository;
    private final AlunoRepository alunoRepository;
    private AvaliacaoFisicaMapper AvaliacaoFisicaMapper = Mappers.getMapper(AvaliacaoFisicaMapper.class);
    private AvaliacaoFisicaUpdateMapper AvaliacaoFisicaUpdateMapper = Mappers.getMapper(AvaliacaoFisicaUpdateMapper.class);

    private AlunoMapper AlunoMapper = Mappers.getMapper(AlunoMapper.class);
    private AlunoUpdateMapper AlunoUpdateMapper = Mappers.getMapper(AlunoUpdateMapper.class);

    @Override
    public AvaliacaoFisicaResponse create(AvaliacaoFisicaRequest request) {
        var aluno = alunoRepository.getById(request.getAlunoId());
        var avaliacao = AvaliacaoFisicaMapper.toDomain(request);
        avaliacao.setAluno(aluno);
        var avaliacaoResponse = AvaliacaoFisicaMapper.toResponse(request);
        repository.save(avaliacao);
        return avaliacaoResponse;
    }

    @Override
    public AvaliacaoFisicaResponse get(Long id) {
        var avaliacao = repository.getById(id);
        var avaliacaoResponse = AvaliacaoFisicaMapper.toDtoResponse(avaliacao);
        avaliacaoResponse.setAlunoId(avaliacao.getAluno().getId());
        return avaliacaoResponse;
    }

    @Override
    public List<AvaliacaoFisicaResponse> getAll() {
        return repository.findAll().stream()
                .map(avaliacaoFisica -> {
                    var avaliacaoResponse = AvaliacaoFisicaMapper.toDtoResponse(avaliacaoFisica);
                    avaliacaoResponse.setAlunoId(avaliacaoFisica.getAluno().getId());
                    return avaliacaoResponse;
                })
                .collect(Collectors.toList());
    }

    @Override
    public AvaliacaoFisicaResponse update(Long id, AvaliacaoFisicaUpdateRequest request) {
        var avaliacaoFisicaExistente = repository.findById(id).orElseThrow(() -> new RuntimeException("Avaliacao não existe"));
        BeanUtils.copyProperties(request, avaliacaoFisicaExistente);
        var avaliacaoUpdate = repository.save(avaliacaoFisicaExistente);
        return AvaliacaoFisicaMapper.toDtoResponse(avaliacaoUpdate);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
