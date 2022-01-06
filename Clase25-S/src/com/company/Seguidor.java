package com.company;

public class Seguidor implements Observador {

    private String nombre;
    private String apellido;

    public Seguidor(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String actualizar() {
        return this.nombre + " fue notificado de la foto que subió ";
    }

}
