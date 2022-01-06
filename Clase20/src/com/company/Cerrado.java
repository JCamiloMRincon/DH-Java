package com.company;

public class Cerrado implements StateCarrito {

    private String nombre = "Cerrado";

    @Override
    public StateCarrito cancelarCarrito() {
        return new Vacio();
    }

    @Override
    public StateCarrito regresar() {
        System.out.println("El carrito ya está cerrado");
        return this;
    }

    @Override
    public StateCarrito pasarAlSiguiente() {
        return new Vacio();
    }

    public String getNombre() {
        return nombre;
    }

}
