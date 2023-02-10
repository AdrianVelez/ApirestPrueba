package com.openbootcamp.demo.models;

public class Bootcamper  {
    private String nombre;
    private double valor;

    public Bootcamper(){

    }
    public Bootcamper(String nombre, double valor) {
        this.valor=valor;
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public Double getValor(){
        return this.valor;
    }
    public void setValor(double valor){
        this.valor=valor;
    }

}
