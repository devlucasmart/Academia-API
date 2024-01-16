package com.devlucasmart.aluno.mappers;

import com.devlucasmart.aluno.dto.Aluno.AlunoRequest;
import com.devlucasmart.aluno.dto.Aluno.AlunoResponse;
import com.devlucasmart.aluno.model.Aluno;
import org.mapstruct.Mapper;

@Mapper
public interface AlunoMapper {
    AlunoRequest toDto(Aluno aluno);
    Aluno toDomain(AlunoRequest request);
    AlunoResponse toDtoResponse(Aluno aluno);
    Aluno toDomain(AlunoResponse response);
    AlunoResponse toResponse(AlunoRequest request);
}

