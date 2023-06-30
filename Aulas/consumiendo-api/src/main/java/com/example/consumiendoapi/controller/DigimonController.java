package com.example.consumiendoapi.controller;

import com.example.consumiendoapi.model.Digimon;
import com.example.consumiendoapi.model.Respuesta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/digimons")
public class DigimonController {

    @GetMapping()
    public List<Digimon> obtenerTodos(){
        String url = "https://digimon-api.vercel.app/api/digimon";

        RestTemplate restTemplate = new RestTemplate();
        List<Digimon> digimons = restTemplate.getForObject(url, ArrayList.class);
        return digimons;
    }

    @GetMapping("/menor-nombre")
    public Digimon obtenerDigimonConMenorNombre(){
        String url = "https://digimon-api.vercel.app/api/digimon";

        RestTemplate restTemplate = new RestTemplate();
        List<Digimon> digimons = restTemplate.getForObject(url, ArrayList.class);
        //List<Digimon> digimons = obtenerTodos();
        
        int tamanoMenorNombre = 1000;
        int index = 0;
        for (int i = 0; i < digimons.size(); i++) {
            if(digimons.get(i).getName().length() < tamanoMenorNombre){
                tamanoMenorNombre = digimons.get(i).getName().length();
                index= i;
            }
        }
        return digimons.get(index);
    }
}
