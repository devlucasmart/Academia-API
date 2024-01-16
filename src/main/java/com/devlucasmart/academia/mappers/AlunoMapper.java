package com.devlucasmart.academia.mappers;

import com.devlucasmart.academia.dto.Aluno.AlunoRequest;
import com.devlucasmart.academia.dto.Aluno.AlunoResponse;
import com.devlucasmart.academia.model.Aluno;
import org.mapstruct.Mapper;

@Mapper
public interface AlunoMapper {
    AlunoRequest toDto(Aluno aluno);
    Aluno toDomain(AlunoRequest request);
    AlunoResponse toDtoResponse(Aluno aluno);
    Aluno toDomain(AlunoResponse response);
    AlunoResponse toResponse(AlunoRequest request);
}

