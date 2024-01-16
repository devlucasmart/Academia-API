package com.devlucasmart.aluno.mappers;

import com.devlucasmart.aluno.model.AvaliacaoFisica;
import com.devlucasmart.aluno.model.form.AvaliacaoFisicaUpdateForm;
import org.mapstruct.Mapper;

@Mapper
public interface AvaliacaoFisicaUpdateMapper {
    AvaliacaoFisicaUpdateForm toDto(AvaliacaoFisica avaliacaoFisica);

    AvaliacaoFisica toDomain(AvaliacaoFisicaUpdateForm form);

}
