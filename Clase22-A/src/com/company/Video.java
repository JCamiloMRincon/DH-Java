package com.company;

public class Video implements Archivo {

    private final String nombre;

    public Video(String nombre) {
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
