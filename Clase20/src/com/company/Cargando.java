package com.company;

public class Cargando implements StateCarrito {

    private String nombre = "Cargando";

    @Override
    public StateCarrito cancelarCarrito() {
        return new Vacio();
    }

    @Override
    public StateCarrito regresar() {
        return new Vacio();
    }

    @Override
    public StateCarrito pasarAlSiguiente() {
        return new Pagando();
    }

    public String getNombre() {
        return nombre;
    }

}
