package com.company;

public class Finalizado implements Estado {

    private String nombre = "Finalizado";

    @Override
    public void cambiarDireccion(String nuevaDireccion) {
        System.out.println("ERROR: No es posible cambiar de dirección.");
    }

    @Override
    public void darValorPresupuesto(double valor) {
        System.out.println("ERROR: No es posible dar un presupuesto.");
    }

    @Override
    public void agregarRepuesto(double valor) {
        System.out.println("ERROR: No es posible agregar un repuesto.");
    }

    @Override
    public Estado siguientePaso() {
        System.out.println("No se puede cambiar de estado");
        return this;
    }

    public String getNombre() {
        return nombre;
    }
}
