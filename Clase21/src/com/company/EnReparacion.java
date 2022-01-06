package com.company;

public class EnReparacion implements Estado{

    private String nombre = "En Reparacion";

    @Override
    public void cambiarDireccion(String nuevaDireccion) {
        System.out.println("ERROR: No es posible cambiar la dirección.");
    }

    @Override
    public void darValorPresupuesto(double valor) {
        System.out.println("ERROR: No es posible dar un presupuesto.");
    }

    @Override
    public void agregarRepuesto(double valor) {
        System.out.println("Se ha agregado un repuesto con valor de: " + valor);
    }

    @Override
    public Estado siguientePaso() {
        return new ParaEnvio();
    }

    public String getNombre() {
        return nombre;
    }



}
