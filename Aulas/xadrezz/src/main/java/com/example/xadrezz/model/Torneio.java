package com.example.xadrezz.model;

import java.math.BigDecimal;
public class Torneio {
    private int id;
    private String nome;
    private String local;
    private BigDecimal premiacao;

    public Torneio(){
    }

    public Torneio(int id, String nome, String local, BigDecimal premiacao) {
        this.id = id;
        this.nome = nome;
        this.local = local;
        this.premiacao = premiacao;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public BigDecimal getPremiacao() {
        return premiacao;
    }

    public void setPremiacao(BigDecimal premiacao) {
        this.premiacao = premiacao;
    }
}

