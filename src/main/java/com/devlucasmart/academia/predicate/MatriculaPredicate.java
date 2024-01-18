package com.devlucasmart.academia.predicate;

import com.devlucasmart.academia.comum.predicate.PredicateBase;

import java.time.LocalDateTime;

import static com.devlucasmart.academia.model.QMatricula.matricula;

public class MatriculaPredicate extends PredicateBase {
    public MatriculaPredicate comId(Long id) {
        if (id != null) {
            builder.and(matricula.id.eq(id));
        }
        return this;
    }

    public MatriculaPredicate comAlunoId(Long alunoId) {
        if (alunoId != null) {
            builder.and(matricula.aluno.id.eq(alunoId));
        }
        return this;
    }

    public MatriculaPredicate comDataMatricula(LocalDateTime dataMatricula) {
        if (dataMatricula != null) {
            builder.and(matricula.dataMatricula.eq(dataMatricula));
        }
        return this;
    }
}
