package com.Edgar0bsj.bookstoreApi.controller;

import com.Edgar0bsj.bookstoreApi.dto.AutorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autores")
public class AutoresController {

    @PostMapping
    public ResponseEntity salvar(@RequestBody AutorDTO autor){

        return new ResponseEntity("Autor salva com sucesso!" + autor, HttpStatus.CREATED);
    }
}
