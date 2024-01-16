package com.devlucasmart.aluno.mappers;

import com.devlucasmart.aluno.dto.Aluno.AlunoUpdateRequest;
import com.devlucasmart.aluno.dto.Aluno.AlunoUpdateResponse;
import com.devlucasmart.aluno.model.Aluno;
import org.mapstruct.Mapper;

@Mapper
public interface AlunoUpdateMapper {
    AlunoUpdateRequest toDto(Aluno aluno);

    AlunoUpdateResponse toResponse(Aluno aluno);

    Aluno toDomain(AlunoUpdateRequest request);
}
