package com.devlucasmart.aluno.service.impl;

import com.devlucasmart.aluno.mappers.AlunoMapper;
import com.devlucasmart.aluno.mappers.AlunoUpdateMapper;
import com.devlucasmart.aluno.mappers.AvaliacaoFisicaMapper;
import com.devlucasmart.aluno.mappers.AvaliacaoFisicaUpdateMapper;
import com.devlucasmart.aluno.model.AvaliacaoFisica;
import com.devlucasmart.aluno.model.form.AvaliacaoFisicaForm;
import com.devlucasmart.aluno.model.form.AvaliacaoFisicaUpdateForm;
import com.devlucasmart.aluno.repository.AlunoRepository;
import com.devlucasmart.aluno.repository.AvaliacaoFisicaRepository;
import com.devlucasmart.aluno.service.IAvaliacaoFisicaService;
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
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        var avaliacao = AvaliacaoFisicaMapper.toDomain(form);
        return repository.save(avaliacao);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return null;
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
