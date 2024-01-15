package com.devlucasmart.aluno.controller;

import com.devlucasmart.aluno.model.Matricula;
import com.devlucasmart.aluno.model.form.MatriculaForm;
import com.devlucasmart.aluno.service.impl.MatriculaServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/matriculas")
@RequiredArgsConstructor
public class MatriculaController {

    private final MatriculaServiceImpl service;
    @PostMapping
    public Matricula create(@RequestBody MatriculaForm form) {
        return service.create(form);
    }
}
