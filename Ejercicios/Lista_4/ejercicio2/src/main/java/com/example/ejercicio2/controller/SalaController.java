package com.example.ejercicio2.controller;

import com.example.ejercicio2.model.Sala;
import com.example.ejercicio2.service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class SalaController {
    @Autowired
    SalaService salaService;

    @GetMapping
    public List<Sala> getAll(){
        return salaService.getAll();
    }

    @PutMapping
    public String putSala(@RequestBody Sala sala){
        return salaService.putSala(sala);
    }
}
