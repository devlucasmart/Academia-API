package com.devlucasmart.academia.predicate;

import com.devlucasmart.academia.comum.Predicate.PredicateBase;

import java.time.LocalDateTime;

import static com.devlucasmart.academia.model.QAluno.aluno;

public class AlunoPredicate extends PredicateBase {
    public AlunoPredicate comId(Long id) {
        if (id != null) {
            builder.and(aluno.id.eq(id));
        }
        return this;
    }

    public AlunoPredicate comDataDeNascimento(LocalDateTime dataDeNascimento) {
        if (dataDeNascimento != null) {
            builder.and(aluno.dataDeNascimento.eq(dataDeNascimento));
        }
        return this;
    }
}
