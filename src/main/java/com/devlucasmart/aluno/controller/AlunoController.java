package com.devlucasmart.aluno.controller;

import com.devlucasmart.aluno.dto.Aluno.AlunoAvaliacoesResponse;
import com.devlucasmart.aluno.dto.Aluno.AlunoRequest;
import com.devlucasmart.aluno.dto.Aluno.AlunoResponse;
import com.devlucasmart.aluno.dto.Aluno.AlunoUpdateRequest;
import com.devlucasmart.aluno.service.impl.AlunoServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/alunos")
@RequiredArgsConstructor
public class AlunoController {
    private final AlunoServiceImpl service;

    @GetMapping
    public List<AlunoResponse> getAll() {
        return service.getAll();
    }

    @GetMapping("{id}")
    public ResponseEntity<AlunoResponse> getById(@PathVariable Long id) {
        return ResponseEntity.ok().body(service.get(id));
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AlunoAvaliacoesResponse> getAllAvaliacaoFisicaId(@PathVariable Long id) {
        return service.getAllAvaliacaoFisica(id);
    }

    @PostMapping
    public AlunoResponse create(@Valid @RequestBody AlunoRequest request) {
        return service.create(request);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @Valid @RequestBody AlunoUpdateRequest request) {
        service.update(id, request);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
