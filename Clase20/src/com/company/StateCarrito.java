package com.company;

public interface StateCarrito {

    public String getNombre();
    public StateCarrito cancelarCarrito();
    public StateCarrito regresar();
    public StateCarrito pasarAlSiguiente();

}
