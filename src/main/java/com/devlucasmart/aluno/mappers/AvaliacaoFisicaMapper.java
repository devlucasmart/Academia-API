package com.devlucasmart.aluno.mappers;

import com.devlucasmart.aluno.model.AvaliacaoFisica;
import com.devlucasmart.aluno.model.Matricula;
import com.devlucasmart.aluno.model.form.AvaliacaoFisicaForm;
import com.devlucasmart.aluno.model.form.MatriculaForm;
import org.mapstruct.Mapper;

@Mapper
public interface AvaliacaoFisicaMapper {
    AvaliacaoFisicaForm toDto(AvaliacaoFisica avaliacaoFisica);

    AvaliacaoFisica toDomain(AvaliacaoFisicaForm form);
}
