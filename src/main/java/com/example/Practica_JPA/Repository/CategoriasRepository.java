package com.example.Practica_JPA.Repository;

import com.example.Practica_JPA.Model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoriasRepository extends JpaRepository<Categoria,Integer> {

    Optional<Categoria> findByNombre(String nombre);


}
