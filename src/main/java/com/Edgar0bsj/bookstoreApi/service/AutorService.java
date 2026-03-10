package com.Edgar0bsj.bookstoreApi.service;

import com.Edgar0bsj.bookstoreApi.entity.Autor;
import com.Edgar0bsj.bookstoreApi.repository.AutorRepository;
import org.springframework.stereotype.Service;

@Service
public class AutorService {
    private final AutorRepository repository;

    public AutorService(AutorRepository repository) {
        this.repository = repository;
    }

    public Autor salvar(Autor autor){
        return this.repository.save(autor);
    }
}
