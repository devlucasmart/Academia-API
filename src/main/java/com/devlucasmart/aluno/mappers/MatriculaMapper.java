package com.devlucasmart.aluno.mappers;

import com.devlucasmart.aluno.model.Matricula;
import com.devlucasmart.aluno.model.form.MatriculaForm;
import org.mapstruct.Mapper;

@Mapper
public interface MatriculaMapper {

    MatriculaForm toDto(Matricula matricula);

    Matricula toDomain(MatriculaForm form);
}
