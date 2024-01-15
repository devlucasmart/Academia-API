package com.devlucasmart.aluno.controller;

import com.devlucasmart.aluno.model.AvaliacaoFisica;
import com.devlucasmart.aluno.model.form.AvaliacaoFisicaForm;
import com.devlucasmart.aluno.service.impl.AvaliacaoFisicaServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacoes")
@RequiredArgsConstructor
public class AvaliacaoFisicaController {
     private final AvaliacaoFisicaServiceImpl service;

     @PostMapping
     public AvaliacaoFisica  create(@RequestBody AvaliacaoFisicaForm form) {
          return service.create(form);
     }
}
