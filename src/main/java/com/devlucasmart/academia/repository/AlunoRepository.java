package com.devlucasmart.academia.repository;

import com.devlucasmart.academia.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    Aluno getById(Long id);
}
