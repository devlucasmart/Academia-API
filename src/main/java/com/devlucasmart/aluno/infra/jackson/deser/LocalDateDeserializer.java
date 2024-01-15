package com.devlucasmart.aluno.infra.jackson.deser;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class LocalDateDeserializer extends StdDeserializer<LocalDate> {

    private static final long serialVersionUID = -4589164298310392227L;
    private final DateTimeFormatter formatter;

    public LocalDateDeserializer(DateTimeFormatter formatter) {
        super(LocalDate.class);
        this.formatter = formatter;
    }

    @Override
    public LocalDate deserialize(final JsonParser parser, DeserializationContext context) throws IOException, JacksonException {
        try {
            return LocalDate.parse(parser.readValueAs(String.class), formatter);
        } catch (DateTimeParseException e) {
            throw new JsonParseException(parser, "Error parsing LocalDate: " + e.getMessage(), e);
        }
    }
}
