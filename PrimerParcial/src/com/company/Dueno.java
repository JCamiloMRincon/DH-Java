package com.company;

public class Dueno {

    private String nombre;
    private String apellido;
    private String cuil;

    public Dueno(String nombre, String apellido, String cuil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuil = cuil;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
