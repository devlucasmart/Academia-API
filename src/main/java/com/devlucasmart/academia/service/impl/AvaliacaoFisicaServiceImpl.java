package com.devlucasmart.academia.service.impl;

import com.devlucasmart.academia.dto.avaliacao.request.AvaliacaoFisicaRequest;
import com.devlucasmart.academia.dto.avaliacao.response.AvaliacaoFisicaResponse;
import com.devlucasmart.academia.dto.avaliacao.request.AvaliacaoFisicaUpdateRequest;
import com.devlucasmart.academia.mappers.AvaliacaoFisicaMapper;
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
    private AvaliacaoFisicaMapper avaliacaoFisicaMapper = Mappers.getMapper(AvaliacaoFisicaMapper.class);

    @Override
    public AvaliacaoFisicaResponse create(AvaliacaoFisicaRequest request) {
        var aluno = alunoRepository.getById(request.getAlunoId());
        var avaliacao = avaliacaoFisicaMapper.toDomain(request);
        avaliacao.setAluno(aluno);
        var avaliacaoResponse = avaliacaoFisicaMapper.toResponse(request);
        repository.save(avaliacao);
        return avaliacaoResponse;
    }

    @Override
    public AvaliacaoFisicaResponse get(Long id) {
        var avaliacao = repository.getById(id);
        var avaliacaoResponse = avaliacaoFisicaMapper.toDtoResponse(avaliacao);
        avaliacaoResponse.setId(avaliacao.getId());
        avaliacaoResponse.setAlunoId(avaliacao.getAluno().getId());
        return avaliacaoResponse;
    }

    @Override
    public List<AvaliacaoFisicaResponse> getAll() {
        return repository.findAll().stream()
                .map(avaliacaoFisica -> {
                    var avaliacaoResponse = avaliacaoFisicaMapper.toDtoResponse(avaliacaoFisica);
                    avaliacaoResponse.setId(avaliacaoFisica.getId());
                    avaliacaoResponse.setAlunoId(avaliacaoFisica.getAluno().getId());
                    return avaliacaoResponse;
                })
                .collect(Collectors.toList());
    }

    @Override
    public void update(Long id, AvaliacaoFisicaUpdateRequest request) {
        var avaliacaoFisicaExistente = repository.findById(id).orElseThrow(() -> new RuntimeException("Avaliacao não existe"));
        BeanUtils.copyProperties(request, avaliacaoFisicaExistente);
        repository.save(avaliacaoFisicaExistente);

    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
