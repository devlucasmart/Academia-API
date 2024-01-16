package com.devlucasmart.academia.service.impl;

import com.devlucasmart.academia.dto.AvaliacaoFisica.AvaliacaoFisicaRequest;
import com.devlucasmart.academia.dto.AvaliacaoFisica.AvaliacaoFisicaUpdateRequest;
import com.devlucasmart.academia.mappers.AlunoMapper;
import com.devlucasmart.academia.mappers.AlunoUpdateMapper;
import com.devlucasmart.academia.mappers.AvaliacaoFisicaMapper;
import com.devlucasmart.academia.mappers.AvaliacaoFisicaUpdateMapper;
import com.devlucasmart.academia.model.AvaliacaoFisica;
import com.devlucasmart.academia.repository.AlunoRepository;
import com.devlucasmart.academia.repository.AvaliacaoFisicaRepository;
import com.devlucasmart.academia.service.IAvaliacaoFisicaService;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public AvaliacaoFisica create(AvaliacaoFisicaRequest form) {
        var avaliacao = AvaliacaoFisicaMapper.toDomain(form);
        var aluno = alunoRepository.getById(form.getAlunoId());
        avaliacao.setAluno(aluno);
        return repository.save(avaliacao);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return repository.findAll();
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateRequest formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}