package com.example.xadrezz.service;

import com.example.xadrezz.model.Torneio;
import com.example.xadrezz.repository.BancoDeDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TorneioService {
    @Autowired
    private BancoDeDados bancoDeDados;

    public List<Torneio> getAll(){
        return bancoDeDados.findAll();
    }

    public Torneio getById(int id){
        List<Torneio> torneios = bancoDeDados.findAll();

        for(Torneio torneio : torneios){
            if(torneio.getId() == id){
                return torneio;
            }
        }
        return null;
    }
    public boolean save(Torneio torneio){
        return bancoDeDados.save(torneio);
    }

    public String delete(int id){
        return bancoDeDados.delete(id);
    }
}
