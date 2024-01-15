package com.devlucasmart.aluno.service;

import com.devlucasmart.aluno.model.AvaliacaoFisica;
import com.devlucasmart.aluno.model.form.AvaliacaoFisicaForm;
import com.devlucasmart.aluno.model.form.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface IAvaliacaoFisicaService {

    AvaliacaoFisica create (AvaliacaoFisicaForm form);

    AvaliacaoFisica get(Long id);

    List<AvaliacaoFisica> getAll();

    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

    void delete(Long id);
}
