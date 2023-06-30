package com.example.consumiendoapi.model;

import java.util.ArrayList;
import java.util.List;

public class PokemonResponse {
    private int count;
    private String next;
    private String previous;
    private List<Pokemon> resoults = new ArrayList<>();

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public List<Pokemon> getResoults() {
        return resoults;
    }

    public void setResoults(List<Pokemon> resoults) {
        this.resoults = resoults;
    }
}
