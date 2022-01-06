package com.company;

public class Texto implements Archivo {

    private final String nombre;

    public Texto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getFileType() {
        return this.getClass().getSimpleName();
    }

}
