package com.example.ejercicio2.service;

import com.example.ejercicio2.model.Sala;
import com.example.ejercicio2.repository.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalaService {
    @Autowired
    BancoDeDados bancoDeDados;

    public List<Sala> getAll(){
        return bancoDeDados.getAll();
    }

    public String putSala(Sala sala){
        return bancoDeDados.putSala(sala);
    }
}
