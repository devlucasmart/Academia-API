package com.devlucasmart.academia.mappers;

import com.devlucasmart.academia.dto.aluno.request.AlunoUpdateRequest;
import com.devlucasmart.academia.dto.aluno.response.AlunoUpdateResponse;
import com.devlucasmart.academia.model.Aluno;
import org.mapstruct.Mapper;

@Mapper
public interface AlunoUpdateMapper {

    AlunoUpdateResponse toResponse(Aluno aluno);

    Aluno toDomain(AlunoUpdateRequest request);
}
