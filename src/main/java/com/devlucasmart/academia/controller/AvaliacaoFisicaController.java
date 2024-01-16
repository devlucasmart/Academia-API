package com.devlucasmart.academia.controller;

import com.devlucasmart.academia.dto.AvaliacaoFisica.AvaliacaoFisicaRequest;
import com.devlucasmart.academia.dto.AvaliacaoFisica.AvaliacaoFisicaUpdateRequest;
import com.devlucasmart.academia.model.AvaliacaoFisica;
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

import java.util.List;

@RestController
@RequestMapping("/avaliacoes")
@RequiredArgsConstructor
public class AvaliacaoFisicaController {
    private final AvaliacaoFisicaServiceImpl service;

    @GetMapping
    public List<AvaliacaoFisica> getAll() {
        return service.getAll();
    }

    @GetMapping("/id")
    public AvaliacaoFisica getById(@PathVariable Long id) {
        return service.get(id);
    }

    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaRequest request) {
        return service.create(request);
    }

    @PutMapping("/id")
    public AvaliacaoFisica update(@PathVariable Long id, @RequestBody AvaliacaoFisicaUpdateRequest request) {
        return service.update(id, request);
    }

    @DeleteMapping("/id")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
