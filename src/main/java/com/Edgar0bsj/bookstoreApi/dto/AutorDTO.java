package com.Edgar0bsj.bookstoreApi.dto;

import com.Edgar0bsj.bookstoreApi.entity.Autor;

import java.time.LocalDate;

public record AutorDTO(
        String nome,
        LocalDate dataNascimento,
        String nacionalidade
) {

    public Autor parseEntity(){
        Autor autor = new Autor();
        autor.setNome(this.nome);
        autor.setDataNascimento(this.dataNascimento);
        autor.setNacionalidade(this.nacionalidade);
        return autor;
    }
}
