package br.com.aula4.model.jogos;

import org.springframework.stereotype.Component;

@Component
public class FireEmblem implements Jogo{

    @Override
    public void iniciar(){
        System.out.println("O jogo foi iniciado");
    }
    @Override
    public void salvar(){
        System.out.println("O jogo foi salvo");
    }
}
