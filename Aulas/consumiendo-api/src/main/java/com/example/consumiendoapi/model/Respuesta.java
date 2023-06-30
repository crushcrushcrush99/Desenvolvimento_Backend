package com.example.consumiendoapi.model;

import java.util.ArrayList;
import java.util.List;

public class Respuesta {
    private List<Digimon> digimons = new ArrayList<>();

    public List<Digimon> getDigimons() {
        return digimons;
    }

    public void setDigimons(List<Digimon> digimons) {
        this.digimons = digimons;
    }
}
