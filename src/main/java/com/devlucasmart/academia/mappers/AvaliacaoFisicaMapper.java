package com.devlucasmart.academia.mappers;

import com.devlucasmart.academia.dto.AvaliacaoFisica.AvaliacaoFisicaRequest;
import com.devlucasmart.academia.dto.AvaliacaoFisica.AvaliacaoFisicaResponse;
import com.devlucasmart.academia.model.AvaliacaoFisica;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface AvaliacaoFisicaMapper {
    AvaliacaoFisicaRequest toDtoRequest(AvaliacaoFisica avaliacaoFisica);

    AvaliacaoFisica toDomain(AvaliacaoFisicaRequest request);

    AvaliacaoFisicaResponse toDtoResponse(AvaliacaoFisica avaliacaoFisica);

    List<AvaliacaoFisicaResponse> toDtoListResponse(List<AvaliacaoFisica> avaliacaoFisica);

    AvaliacaoFisicaResponse toResponse(AvaliacaoFisicaRequest request);
}
