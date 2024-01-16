package com.devlucasmart.aluno.mappers;

import com.devlucasmart.aluno.dto.Matricula.MatriculaRequest;
import com.devlucasmart.aluno.model.Matricula;
import org.mapstruct.Mapper;

@Mapper
public interface MatriculaMapper {

    MatriculaRequest toDto(Matricula matricula);

    Matricula toDomain(MatriculaRequest form);
}
