package com.company;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements Observable {

    private String nombre;
    private String apellido;
    private List<Observador> seguidores;

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.seguidores = new ArrayList<>();
    }

    @Override
    public void agregar(Observador o) {
        seguidores.add(o);
    }

    @Override
    public void eliminar(Observador o) {
        seguidores.remove(o);
    }

    @Override
    public void notificarSeguidores() {
        for (Observador seguidor : seguidores) {
            System.out.println(seguidor.actualizar() + this.nombre);
        }
    }

}
