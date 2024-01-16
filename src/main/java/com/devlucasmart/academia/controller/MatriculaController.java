package com.devlucasmart.academia.controller;

import com.devlucasmart.academia.dto.Matricula.MatriculaRequest;
import com.devlucasmart.academia.model.Matricula;
import com.devlucasmart.academia.service.impl.MatriculaServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
@RequiredArgsConstructor
public class MatriculaController {

    private final MatriculaServiceImpl service;

    @GetMapping
    public List<Matricula> getAll() {
        return service.getAll();
    }

    @GetMapping("id")
    public Matricula getById(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public Matricula create(@RequestBody MatriculaRequest request) {
        return service.create(request);
    }

    @DeleteMapping
    public void update(@PathVariable Long id) {
        service.delete(id);
    }
}
