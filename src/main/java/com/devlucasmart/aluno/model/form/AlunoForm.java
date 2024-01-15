package com.devlucasmart.aluno.model.form;

import com.devlucasmart.aluno.infra.jackson.deser.LocalDateTimeDeserializer;
import com.devlucasmart.aluno.infra.jackson.deser.LocalDateTimeSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {
    private String nome;
    private String cpf;
    private String bairro;
    private LocalDateTime dataDeNascimento;
}
