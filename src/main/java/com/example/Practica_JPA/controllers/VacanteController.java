package com.example.Practica_JPA.controllers;

import com.example.Practica_JPA.Model.Vacante;
import com.example.Practica_JPA.Repository.VacatantesRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VacanteController {

    private VacatantesRepository vacatantesRepository;

    public VacanteController(VacatantesRepository vacatantesRepository) {
        this.vacatantesRepository = vacatantesRepository;
    }

    @GetMapping(value = "vacante/get/all")
    public ResponseEntity<List<Vacante>> getAllVacantes() {
        List<Vacante> vacantes = vacatantesRepository.findAll();

        return ResponseEntity.ok(vacantes);
    }
}
