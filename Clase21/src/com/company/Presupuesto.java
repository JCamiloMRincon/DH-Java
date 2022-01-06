package com.company;

public class Presupuesto implements Estado{

    private String nombre = "Presupuesto";

    @Override
    public void cambiarDireccion(String nuevaDireccion) {
        System.out.println("ERROR: No es posible cambiar la dirección.");
    }

    @Override
    public void darValorPresupuesto(double valor) {
        System.out.println("Se ha agregado el presupuesto de: " + valor);
    }

    @Override
    public void agregarRepuesto(double valor) {
        System.out.println("ERROR: No es posible agregar repuesto.");
    }

    @Override
    public Estado siguientePaso() {
        return new EnReparacion();
    }

    public String getNombre() {
        return nombre;
    }

}
