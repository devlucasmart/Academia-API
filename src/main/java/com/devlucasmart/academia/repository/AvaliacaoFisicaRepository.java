package com.devlucasmart.academia.repository;

import com.devlucasmart.academia.model.AvaliacaoFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoFisicaRepository extends JpaRepository<AvaliacaoFisica, Long>,
        QuerydslPredicateExecutor<AvaliacaoFisica> {

}
