package com.devlucasmart.academia.mappers;

import com.devlucasmart.academia.dto.aluno.response.AlunoAvaliacoesResponse;
import com.devlucasmart.academia.model.Aluno;
import org.mapstruct.Mapper;

@Mapper
public interface AlunoAvaliacoesMapper {
    AlunoAvaliacoesResponse toDto(Aluno aluno);
}
