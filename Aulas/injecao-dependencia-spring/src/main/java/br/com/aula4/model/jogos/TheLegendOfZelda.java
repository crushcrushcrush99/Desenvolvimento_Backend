package br.com.aula4.model.jogos;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TheLegendOfZelda implements Jogo{

    @Override
    public void iniciar(){
        System.out.println("O jogo foi iniciado");
    }
    @Override
    public void salvar(){
        System.out.println("O jogo foi salvo");
    }
}
