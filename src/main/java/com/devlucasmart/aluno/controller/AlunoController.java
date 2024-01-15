package com.devlucasmart.aluno.controller;

import com.devlucasmart.aluno.model.Aluno;
import com.devlucasmart.aluno.model.form.AlunoForm;
import com.devlucasmart.aluno.service.impl.AlunoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alunos")
@RequiredArgsConstructor
public class AlunoController {
    private final AlunoServiceImpl service;
    @GetMapping
    public List<Aluno> getAll() {
        return service.getAll();
    }

    @PostMapping
    public Aluno create(@RequestBody AlunoForm form) {
        return service.create(form);
    }
}
