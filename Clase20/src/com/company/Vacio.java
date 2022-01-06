package com.company;

public class Vacio implements StateCarrito {

    private String nombre = "Vacio";

    @Override
    public StateCarrito cancelarCarrito() {
        return this;
    }

    @Override
    public StateCarrito regresar() {
        return this;
    }

    @Override
    public StateCarrito pasarAlSiguiente() {
        return new Cargando();
    }

    public String getNombre() {
        return nombre;
    }

}
