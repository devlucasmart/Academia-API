package com.devlucasmart.academia.predicate;

import com.devlucasmart.academia.comum.Predicate.PredicateBase;

import static com.devlucasmart.academia.model.QAvaliacaoFisica.avaliacaoFisica;

public class AvaliacaoFisicaPredicate extends PredicateBase {
    public AvaliacaoFisicaPredicate comId(Long id) {
        if (id != null) {
            builder.and(avaliacaoFisica.id.eq(id));
        }
        return this;
    }
}
