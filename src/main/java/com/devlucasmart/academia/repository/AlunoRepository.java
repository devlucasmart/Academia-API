package com.devlucasmart.academia.repository;

import com.devlucasmart.academia.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>, QuerydslPredicateExecutor<Aluno> {
    Aluno getById(Long id);
}
