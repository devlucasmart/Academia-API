package com.devlucasmart.academia.service;

import com.devlucasmart.academia.dto.avaliacao.request.AvaliacaoFisicaRequest;
import com.devlucasmart.academia.dto.avaliacao.response.AvaliacaoFisicaResponse;
import com.devlucasmart.academia.dto.avaliacao.request.AvaliacaoFisicaUpdateRequest;

import java.util.List;

public interface IAvaliacaoFisicaService {

    AvaliacaoFisicaResponse create(AvaliacaoFisicaRequest request);

    AvaliacaoFisicaResponse get(Long id);

    List<AvaliacaoFisicaResponse> getAll();

    void update(Long id, AvaliacaoFisicaUpdateRequest requestUpdate);

    void delete(Long id);
}
