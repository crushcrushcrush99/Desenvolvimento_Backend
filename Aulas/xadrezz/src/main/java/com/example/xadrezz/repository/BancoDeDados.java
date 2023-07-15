package com.example.xadrezz.repository;

import com.example.xadrezz.model.Torneio;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {
    List<Torneio> torneios = new ArrayList<>();

    public BancoDeDados(){
        torneios.add(new Torneio(1, "Title tuesday", "Chess.com", new BigDecimal(200.00)));
        torneios.add(new Torneio(2,"Tata Steal", "Holanda", new BigDecimal(300.00)));
        torneios.add(new Torneio(3,"Copa do mundo", "Africa do Sul", new BigDecimal(240.22)));
    }

    public List<Torneio> findAll(){
        return torneios;
    }
    public boolean save(Torneio torneio){
       return this.torneios.add(torneio);
    }

    public String delete(int id){
        for(Torneio torneio : torneios){
            if(torneio.getId() == id){
                String mensagem = "O torneio " + torneio.getNome() + " foi removido com sucesso!";
                torneios.remove(torneio);
                return mensagem;
            }
        }
        return "Esse torneio nao existe...";
    }
}
