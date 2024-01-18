package com.devlucasmart.academia.controller;

import com.devlucasmart.academia.dto.matricula.request.MatriculaRequest;
import com.devlucasmart.academia.dto.matricula.response.MatriculaResponse;
import com.devlucasmart.academia.service.impl.MatriculaServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
@RequiredArgsConstructor
public class MatriculaController {
    private final MatriculaServiceImpl service;

    @GetMapping
    public List<MatriculaResponse> getAll() {
        return service.getAll();
    }

    @GetMapping("{id}")
    public MatriculaResponse getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping
    public MatriculaResponse create(@Valid @RequestBody MatriculaRequest request) {
        return service.create(request);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
