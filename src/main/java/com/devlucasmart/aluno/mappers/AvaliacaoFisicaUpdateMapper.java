package com.devlucasmart.aluno.mappers;

import com.devlucasmart.aluno.dto.AvaliacaoFisica.AvaliacaoFisicaUpdateRequest;
import com.devlucasmart.aluno.model.AvaliacaoFisica;
import org.mapstruct.Mapper;

@Mapper
public interface AvaliacaoFisicaUpdateMapper {
    AvaliacaoFisicaUpdateRequest toDto(AvaliacaoFisica avaliacaoFisica);

    AvaliacaoFisica toDomain(AvaliacaoFisicaUpdateRequest request);

}
