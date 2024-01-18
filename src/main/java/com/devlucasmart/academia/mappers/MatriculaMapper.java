package com.devlucasmart.academia.mappers;

import com.devlucasmart.academia.dto.matricula.request.MatriculaRequest;
import com.devlucasmart.academia.dto.matricula.response.MatriculaResponse;
import com.devlucasmart.academia.model.Matricula;
import org.mapstruct.Mapper;

@Mapper
public interface MatriculaMapper {
    Matricula toDomain(MatriculaRequest request);

    MatriculaResponse toDtoResponse(Matricula matricula);

    MatriculaResponse toResponse(MatriculaRequest request);
}
