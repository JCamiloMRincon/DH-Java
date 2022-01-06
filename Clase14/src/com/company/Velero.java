package com.company;

public class Velero extends Embarcacion {

    private int cantidadMastiles;

    public Velero(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public boolean evaluarTamanio() {
        return (this.cantidadMastiles > 4);
    }

}
