package com.Edgar0bsj.bookstoreApi.dto;

import java.time.LocalDate;

public record AutorDTO(
        String nome,
        LocalDate dataNascimento,
        String nacionalidade
) {
}
