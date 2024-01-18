package com.devlucasmart.academia.controller;

import com.devlucasmart.academia.dto.AvaliacaoFisica.AvaliacaoFisicaRequest;
import com.devlucasmart.academia.dto.AvaliacaoFisica.AvaliacaoFisicaResponse;
import com.devlucasmart.academia.dto.AvaliacaoFisica.AvaliacaoFisicaUpdateRequest;
import com.devlucasmart.academia.service.impl.AvaliacaoFisicaServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
@RequiredArgsConstructor
public class AvaliacaoFisicaController {
    private final AvaliacaoFisicaServiceImpl service;

    @GetMapping
    public List<AvaliacaoFisicaResponse> getAll() {
        return service.getAll();
    }

    @GetMapping("{id}")
    public AvaliacaoFisicaResponse getById(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public AvaliacaoFisicaResponse create(@Valid @RequestBody AvaliacaoFisicaRequest request) {
        return service.create(request);
    }

    @PutMapping("{id}")
    public AvaliacaoFisicaResponse update(@PathVariable Long id, @RequestBody AvaliacaoFisicaUpdateRequest request) {
        return service.update(id, request);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
