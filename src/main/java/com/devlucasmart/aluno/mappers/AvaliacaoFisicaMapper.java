package com.devlucasmart.aluno.mappers;

import com.devlucasmart.aluno.dto.AvaliacaoFisica.AvaliacaoFisicaRequest;
import com.devlucasmart.aluno.model.AvaliacaoFisica;
import org.mapstruct.Mapper;

@Mapper
public interface AvaliacaoFisicaMapper {
    AvaliacaoFisicaRequest toDto(AvaliacaoFisica avaliacaoFisica);

    AvaliacaoFisica toDomain(AvaliacaoFisicaRequest request);
}
