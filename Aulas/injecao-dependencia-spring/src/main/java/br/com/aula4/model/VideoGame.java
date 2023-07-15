package br.com.aula4.model;

import br.com.aula4.model.controladores.Joystick;
import br.com.aula4.model.jogos.Jogo;
import br.com.aula4.model.jogos.TheLegendOfZelda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import java.math.BigDecimal;

@Component
public class VideoGame {
    private String marca;
    private String modelo;
    private BigDecimal preco;
    @Autowired
    @Qualifier
    private Jogo jogo;
    @Autowired
    private Joystick joystick;


    /*public VideoGame(Jogo jogo, Joystick joystick) {
        this.jogo = jogo;
        this.joystick = joystick;
    }

    public VideoGame(String marca, String modelo, BigDecimal preco, Jogo jogo, Joystick joystick) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.jogo = jogo;
        this.joystick = joystick;
    }*/

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public Joystick getJoystick() {
        return joystick;
    }

    public void setJoystick(Joystick joystick) {
        this.joystick = joystick;
    }
}
