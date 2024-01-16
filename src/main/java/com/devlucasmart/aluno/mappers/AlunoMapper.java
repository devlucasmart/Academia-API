package com.devlucasmart.aluno.mappers;

import com.devlucasmart.aluno.model.Aluno;
import com.devlucasmart.aluno.model.Matricula;
import com.devlucasmart.aluno.model.form.AlunoForm;
import com.devlucasmart.aluno.model.form.MatriculaForm;
import org.mapstruct.Mapper;

@Mapper
public interface AlunoMapper {
    AlunoForm toDto(Aluno aluno);

    Aluno toDomain(AlunoForm form);
}

