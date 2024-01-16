package com.devlucasmart.aluno.controller;

import com.devlucasmart.aluno.model.AvaliacaoFisica;
import com.devlucasmart.aluno.model.form.AvaliacaoFisicaForm;
import com.devlucasmart.aluno.model.form.AvaliacaoFisicaUpdateForm;
import com.devlucasmart.aluno.service.impl.AvaliacaoFisicaServiceImpl;
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

     @GetMapping("id")
     public AvaliacaoFisica getById(@PathVariable Long id) {
          return service.get(id);
     }

     @PostMapping
     public AvaliacaoFisica  create(@RequestBody AvaliacaoFisicaForm form) {
          return service.create(form);
     }

     @PutMapping("id")
     public AvaliacaoFisica update(@PathVariable Long id, @RequestBody AvaliacaoFisicaUpdateForm form) {
          return service.update(id, form);
     }

     @DeleteMapping
     public void delete(@PathVariable Long id) {
          service.delete(id);
     }
}
