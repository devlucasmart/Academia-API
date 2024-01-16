package com.devlucasmart.academia.mappers;

import com.devlucasmart.academia.dto.Matricula.MatriculaRequest;
import com.devlucasmart.academia.model.Matricula;
import org.mapstruct.Mapper;

@Mapper
public interface MatriculaMapper {

    MatriculaRequest toDto(Matricula matricula);

    Matricula toDomain(MatriculaRequest form);
}
