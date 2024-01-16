package com.devlucasmart.academia.mappers;

import com.devlucasmart.academia.dto.Aluno.AlunoAvaliacoesResponse;
import com.devlucasmart.academia.model.Aluno;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface AlunoAvaliacoesMapper {
    @Mapping(target = "avaliacoes", source = "aluno.avaliacoes")
    AlunoAvaliacoesResponse toDto(Aluno aluno);

    @Mapping(target = "avaliacoes", source = "response.avaliacoes")
    Aluno toDomain(AlunoAvaliacoesResponse response);
}
