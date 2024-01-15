package com.devlucasmart.aluno.repository;

import com.devlucasmart.aluno.model.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
}
