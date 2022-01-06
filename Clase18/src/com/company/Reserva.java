package com.company;

public class Reserva {

    private String codigo;
    private int cantViajeros;
    private String estacionOrigen;
    private String estacionDestino;

    public Reserva(String codigo, int cantViajeros, String estacionOrigen, String estacionDestino) {
        this.codigo = codigo;
        this.cantViajeros = cantViajeros;
        this.estacionOrigen = estacionOrigen;
        this.estacionDestino = estacionDestino;
    }

    public double getPrecio() {
        if ((estacionOrigen.equals("Buenos Aires") && estacionDestino.equals("Bragado")) ||
                (estacionOrigen.equals("Bragado") && estacionDestino.equals("Buenos Aires")))
            return 0.8 * cantViajeros * 50.0;
        return cantViajeros * 50.0;
    }

    public String getEstacionOrigen() {
        return estacionOrigen;
    }

    public String getEstacionDestino() {
        return estacionDestino;
    }

    public int getCantViajeros() {
        return cantViajeros;
    }

    //public boolean fueCompleto() {

    //}

}
