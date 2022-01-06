package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<Servicio> servicios;

    public Empresa() {
        this.servicios = new ArrayList<>();
    }

    public void mostrarServicios() {
        for (Servicio serv : servicios) {
            System.out.println("Servicio: " + serv.getNombre() +
                    ", precio: " + serv.calcularPrecio());
        }
    }

    public void agregarServicio(Servicio s) {
        this.servicios.add(s);
    }

    public void eliminarServicio(Servicio s) {
        this.servicios.remove(s);
    }

}
