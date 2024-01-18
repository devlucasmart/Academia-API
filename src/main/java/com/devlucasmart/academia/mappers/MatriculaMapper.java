package com.devlucasmart.academia.mappers;

import com.devlucasmart.academia.dto.Matricula.MatriculaRequest;
import com.devlucasmart.academia.dto.Matricula.MatriculaResponse;
import com.devlucasmart.academia.model.Matricula;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface MatriculaMapper {

    MatriculaRequest toDto(Matricula matricula);

    Matricula toDomain(MatriculaRequest request);

    MatriculaResponse toDtoResponse(Matricula matricula);

    MatriculaResponse toResponse(MatriculaRequest request);

    List<MatriculaResponse> toLisResponse(List<Matricula> matricula);
}
