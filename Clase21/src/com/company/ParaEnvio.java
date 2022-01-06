package com.company;

public class ParaEnvio implements Estado{

    private String nombre = "Para Envio";

    @Override
    public void cambiarDireccion(String nuevaDireccion) {
        System.out.println("Se ha cambiado satisfactoriamente la dirección. Nueva dirección: " + nuevaDireccion);
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
        return new Finalizado();
    }

    public String getNombre() {
        return nombre;
    }

}
