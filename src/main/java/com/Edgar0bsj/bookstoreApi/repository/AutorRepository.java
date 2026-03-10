package com.Edgar0bsj.bookstoreApi.repository;

import com.Edgar0bsj.bookstoreApi.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AutorRepository extends JpaRepository<Livro, UUID> {
}
