package com.company;

public class Pagando implements StateCarrito {

    private String nombre = "Pagando";

    @Override
    public StateCarrito cancelarCarrito() {
        return new Vacio();
    }

    @Override
    public StateCarrito regresar() {
        return new Cargando();
    }

    @Override
    public StateCarrito pasarAlSiguiente() {
        return new Cerrado();
    }

    public String getNombre() {
        return nombre;
    }
}
