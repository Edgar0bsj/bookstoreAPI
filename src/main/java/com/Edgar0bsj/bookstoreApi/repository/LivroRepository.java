package com.Edgar0bsj.bookstoreApi.repository;

import com.Edgar0bsj.bookstoreApi.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LivroRepository extends JpaRepository<Autor, UUID> {
}
