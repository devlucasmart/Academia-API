package com.devlucasmart.academia.mappers;

import com.devlucasmart.academia.dto.AvaliacaoFisica.AvaliacaoFisicaRequest;
import com.devlucasmart.academia.model.AvaliacaoFisica;
import org.mapstruct.Mapper;

@Mapper
public interface AvaliacaoFisicaMapper {
    AvaliacaoFisicaRequest toDto(AvaliacaoFisica avaliacaoFisica);

    AvaliacaoFisica toDomain(AvaliacaoFisicaRequest request);
}
