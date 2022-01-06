package com.company;

public interface Observable {

    void agregar(Observador o);
    void eliminar(Observador o);
    void notificarSeguidores();

}
