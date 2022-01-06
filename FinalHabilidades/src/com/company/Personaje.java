package com.company;

import java.util.ArrayList;
import java.util.List;

public class Personaje {

    private String nombre;
    private List<Habilidad> habilidades;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.habilidades = new ArrayList<>();
    }

    public void mostrarHabilidades() {
        for (Habilidad habilidad : habilidades) {
            System.out.println("Nombre: " + habilidad.getNombre() +
                    ", tipo: " + habilidad.getClass().getSimpleName() +
                    ", puntaje: " + habilidad.calcularPuntaje());
        }
    }

    public void agregarHabilidad(Habilidad h) {
        habilidades.add(h);
    }

    public void eliminarHabilidad(Habilidad h) {
        habilidades.remove(h);
    }

}
