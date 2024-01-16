package com.devlucasmart.academia.mappers;

import com.devlucasmart.academia.dto.Aluno.AlunoUpdateRequest;
import com.devlucasmart.academia.dto.Aluno.AlunoUpdateResponse;
import com.devlucasmart.academia.model.Aluno;
import org.mapstruct.Mapper;

@Mapper
public interface AlunoUpdateMapper {
    AlunoUpdateRequest toDto(Aluno aluno);

    AlunoUpdateResponse toResponse(Aluno aluno);

    Aluno toDomain(AlunoUpdateRequest request);
}
