package com.devlucasmart.academia.service;

import com.devlucasmart.academia.dto.AvaliacaoFisica.AvaliacaoFisicaRequest;
import com.devlucasmart.academia.dto.AvaliacaoFisica.AvaliacaoFisicaResponse;
import com.devlucasmart.academia.dto.AvaliacaoFisica.AvaliacaoFisicaUpdateRequest;

import java.util.List;

public interface IAvaliacaoFisicaService {

    AvaliacaoFisicaResponse create(AvaliacaoFisicaRequest request);

    AvaliacaoFisicaResponse get(Long id);

    List<AvaliacaoFisicaResponse> getAll();

    AvaliacaoFisicaResponse update(Long id, AvaliacaoFisicaUpdateRequest requestUpdate);

    void delete(Long id);
}
