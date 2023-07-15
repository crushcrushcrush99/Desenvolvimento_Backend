package br.com.aula4.model.jogos;

import org.springframework.stereotype.Component;

@Component
public interface Jogo {

    void iniciar();
    void salvar();
}
