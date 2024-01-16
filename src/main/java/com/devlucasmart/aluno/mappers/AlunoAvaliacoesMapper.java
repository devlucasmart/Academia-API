package com.devlucasmart.aluno.mappers;

import com.devlucasmart.aluno.dto.Aluno.AlunoAvaliacoesResponse;
import com.devlucasmart.aluno.model.Aluno;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface AlunoAvaliacoesMapper {
    @Mapping(target = "avaliacoes", source = "aluno.avaliacoes")
    AlunoAvaliacoesResponse toDto(Aluno aluno);

    @Mapping(target = "avaliacoes", source = "response.avaliacoes")
    Aluno toDomain(AlunoAvaliacoesResponse response);
}
