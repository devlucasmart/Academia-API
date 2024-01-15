package com.devlucasmart.aluno.service.impl;

import com.devlucasmart.aluno.model.Aluno;
import com.devlucasmart.aluno.model.AvaliacaoFisica;
import com.devlucasmart.aluno.model.form.AvaliacaoFisicaForm;
import com.devlucasmart.aluno.model.form.AvaliacaoFisicaUpdateForm;
import com.devlucasmart.aluno.repository.AlunoRepository;
import com.devlucasmart.aluno.repository.AvaliacaoFisicaRepository;
import com.devlucasmart.aluno.service.IAvaliacaoFisicaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {
    private final AvaliacaoFisicaRepository repository;
    private final AlunoRepository alunoRepository;
    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        var aluno = alunoRepository.getById(form.getAlunoId());
        var avaliacao = new AvaliacaoFisica();
        avaliacao.setAluno(aluno);
        avaliacao.setPeso(form.getPeso());
        avaliacao.setAltura(form.getAltura());

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
