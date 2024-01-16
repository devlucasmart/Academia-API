package com.devlucasmart.aluno.controller;

import com.devlucasmart.aluno.model.Aluno;
import com.devlucasmart.aluno.model.form.AlunoForm;
import com.devlucasmart.aluno.model.form.AlunoUpdateForm;
import com.devlucasmart.aluno.service.impl.AlunoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    public List<AlunoForm> getAll() {
        return service.getAll();
    }

    @GetMapping("/id")
    public Aluno getById(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public Aluno create(@RequestBody AlunoForm form) {
        return service.create(form);
    }

    @PutMapping("/id")
    public AlunoUpdateForm update(@PathVariable Long id, @RequestBody AlunoUpdateForm form) {
        return service.update(id, form);
    }

    @DeleteMapping
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
