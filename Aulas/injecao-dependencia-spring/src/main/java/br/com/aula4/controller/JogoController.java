package br.com.aula4.controller;


import br.com.aula4.model.jogos.Jogo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*@RestController
@RequestMapping("/jogos")
public class JogoController {

    @Autowired
    @Qualifier("theLegendOfZelda")
    Jogo jogo;

    @GetMapping
    public Jogo getJogo(){
        return jogo;
    }
}*/
