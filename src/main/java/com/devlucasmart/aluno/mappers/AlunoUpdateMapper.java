package com.devlucasmart.aluno.mappers;

import com.devlucasmart.aluno.model.Aluno;
import com.devlucasmart.aluno.model.form.AlunoUpdateForm;
import org.mapstruct.Mapper;

@Mapper
public interface AlunoUpdateMapper {
    AlunoUpdateForm toDto(Aluno aluno);

    Aluno toDomain(AlunoUpdateForm form);
}
