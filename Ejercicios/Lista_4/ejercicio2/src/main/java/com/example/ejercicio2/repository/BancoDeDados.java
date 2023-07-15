package com.example.ejercicio2.repository;

import com.example.ejercicio2.model.Sala;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {
    private List<Sala> salas = new ArrayList<>();

    public BancoDeDados(){
        salas.add(new Sala(1, true, "LocatorioX"));
        salas.add(new Sala(2, true, "LocatorioV"));
        salas.add(new Sala(3, false, ""));
        salas.add(new Sala(4, true, "LocatorioB"));

    }
    public List<Sala> getAll(){
        return salas;
    }

    public String putSala(Sala sala){
        for (Sala salaDoBancoDeDados : salas) {
            if (salaDoBancoDeDados.getId() == sala.getId()){
                if (salaDoBancoDeDados.Alugada()){
                    return "Sala já alugada";
                } else {
                    salaDoBancoDeDados.setEstaAlugada(true);
                    salaDoBancoDeDados.setNomeLocatorio(sala.getNomeLocatorio());
                }
            }
        }
        return "Sala alugada com sucesso por " + sala.getNomeLocatorio() ;
    }
}
