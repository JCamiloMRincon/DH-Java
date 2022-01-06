package com.company;

public class Auto {

    private String patente;
    private String marca;
    private String modelo;
    private Motor motor;

    public Auto(String patente, String marca, String modelo) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor();
    }

    public String getPatente() {
        return patente;
    }

}
