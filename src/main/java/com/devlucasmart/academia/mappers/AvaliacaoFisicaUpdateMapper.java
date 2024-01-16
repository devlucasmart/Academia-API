package com.devlucasmart.academia.mappers;

import com.devlucasmart.academia.dto.AvaliacaoFisica.AvaliacaoFisicaUpdateRequest;
import com.devlucasmart.academia.model.AvaliacaoFisica;
import org.mapstruct.Mapper;

@Mapper
public interface AvaliacaoFisicaUpdateMapper {
    AvaliacaoFisicaUpdateRequest toDto(AvaliacaoFisica avaliacaoFisica);

    AvaliacaoFisica toDomain(AvaliacaoFisicaUpdateRequest request);

}
