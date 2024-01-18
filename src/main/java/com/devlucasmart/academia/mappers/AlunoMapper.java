package com.devlucasmart.academia.mappers;

import com.devlucasmart.academia.dto.aluno.request.AlunoRequest;
import com.devlucasmart.academia.dto.aluno.response.AlunoResponse;
import com.devlucasmart.academia.model.Aluno;
import org.mapstruct.Mapper;

@Mapper
public interface AlunoMapper {

    Aluno toDomain(AlunoRequest request);

    AlunoResponse toDtoResponse(Aluno aluno);
}

