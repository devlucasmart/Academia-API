package com.devlucasmart.aluno.service;

import com.devlucasmart.aluno.dto.AvaliacaoFisica.AvaliacaoFisicaRequest;
import com.devlucasmart.aluno.dto.AvaliacaoFisica.AvaliacaoFisicaUpdateRequest;
import com.devlucasmart.aluno.model.AvaliacaoFisica;

import java.util.List;

public interface IAvaliacaoFisicaService {

    AvaliacaoFisica create(AvaliacaoFisicaRequest request);

    AvaliacaoFisica get(Long id);

    List<AvaliacaoFisica> getAll();

    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateRequest requestUpdate);

    void delete(Long id);
}
