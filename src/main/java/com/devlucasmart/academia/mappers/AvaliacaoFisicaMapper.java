package com.devlucasmart.academia.mappers;

import com.devlucasmart.academia.dto.avaliacao.request.AvaliacaoFisicaRequest;
import com.devlucasmart.academia.dto.avaliacao.response.AvaliacaoFisicaResponse;
import com.devlucasmart.academia.model.AvaliacaoFisica;
import org.mapstruct.Mapper;

@Mapper
public interface AvaliacaoFisicaMapper {

    AvaliacaoFisica toDomain(AvaliacaoFisicaRequest request);

    AvaliacaoFisicaResponse toDtoResponse(AvaliacaoFisica avaliacaoFisica);

    AvaliacaoFisicaResponse toResponse(AvaliacaoFisicaRequest request);
}
