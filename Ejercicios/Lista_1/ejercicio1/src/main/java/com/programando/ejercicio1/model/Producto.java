package com.programando.ejercicio1.model;

public class Producto {
    private int codigoDeBarras;
    private String nombre;
    private double precio;

    public Producto(){
    }

    public Producto(int codigoDeBarras, String nombre, double precio){
        this.codigoDeBarras = codigoDeBarras;
        this.nombre = nombre;
        this.precio = precio;
    }
    public int getCodigoDeBarras(){
        return codigoDeBarras;
    }
    public void setCodigoDeBarras(int codigoDeBarras){
        this.codigoDeBarras = codigoDeBarras;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

