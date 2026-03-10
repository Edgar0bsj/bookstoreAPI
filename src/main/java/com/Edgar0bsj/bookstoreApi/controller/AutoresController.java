package com.Edgar0bsj.bookstoreApi.controller;

import com.Edgar0bsj.bookstoreApi.dto.AutorDTO;
import com.Edgar0bsj.bookstoreApi.entity.Autor;
import com.Edgar0bsj.bookstoreApi.service.AutorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/autores")
public class AutoresController {

    private final AutorService service;

    public AutoresController(AutorService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Void> salvar(@RequestBody AutorDTO autor){

        Autor autorEntidade = autor.parseEntity();
        this.service.salvar(autorEntidade);

        //Gerando o ID no final da URI
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(autorEntidade.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }
}
