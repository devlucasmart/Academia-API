package com.devlucasmart.academia.comum.Predicate;

import com.querydsl.core.BooleanBuilder;

public class PredicateBase {
    public BooleanBuilder builder;

    public PredicateBase() {
        this.builder = new BooleanBuilder();
    }

    public BooleanBuilder build() {
        return this.builder;
    }
}
