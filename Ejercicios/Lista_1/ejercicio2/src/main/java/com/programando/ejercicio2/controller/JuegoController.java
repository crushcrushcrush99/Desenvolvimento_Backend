package com.programando.ejercicio2.controller;

import com.programando.ejercicio2.model.Juego;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping()
public class JuegoController {
    public List<Juego> juegos = new ArrayList<>();

    public JuegoController() {
        juegos.add(new Juego(14, "Dark Souls 3", 5000));
        juegos.add(new Juego(56, "Sonic Frontiers", 7999));
        juegos.add(new Juego(25, "Celeste", 500));
    }

    @GetMapping("/juegos")
    public List<Juego> getAll() {
        return juegos;
    }

    @GetMapping("/juegos/{id}")
    public Juego getById(@PathVariable int id) {
        for (Juego juego : juegos) {
            if (juego.getId() == id) {
                return juego;
            }
        }
        return null;
    }

    @GetMapping("/juegos/menor-precio")
    public Juego getByMenorPrecio() {
        double menorPrecio = juegos.get(0).getPrecio();
        for (int i = 1; i < juegos.size(); i++) {
            if (juegos.get(i).getPrecio() < menorPrecio) {
                menorPrecio = juegos.get(i).getPrecio();
            }
        }
        Juego juegoMasBarato = null;
        for (Juego juego : juegos){
            if(juego.getPrecio() == menorPrecio){
                juegoMasBarato = juego;
            }
        }
        return juegoMasBarato;
    }

    @PostMapping("/juegos")
    public String save(@RequestBody Juego juego){
        for(Juego item : juegos){
            if(item.getId() == juego.getId()){
                return "Juego ya existente";
            }
        }
        this.juegos.add(juego);
        return "El juego " + juego.getNombre() + " fue agregado al catálogo";
    }
}
