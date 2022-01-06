package com.company;

public interface Estado {

    void cambiarDireccion(String nuevaDireccion);
    void darValorPresupuesto(double valor);
    void agregarRepuesto(double valor);
    Estado siguientePaso();
    String getNombre();

}
