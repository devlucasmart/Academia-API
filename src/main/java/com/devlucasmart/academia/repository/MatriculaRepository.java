package com.devlucasmart.academia.repository;

import com.devlucasmart.academia.model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long>,
        QuerydslPredicateExecutor<Matricula> {
    Matricula getById(Long id);
}
