package com.company;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Servicio {

    private List<Servicio> servicios;
    private double descuento;

    public Combo() {
        this.servicios = new ArrayList<>();
    }

    public void setDescuento(double descuento) throws Exception {
        if (descuento < 0)
            throw new Exception("El descuento debe ser positivo.");
        this.descuento = descuento;
    }

    @Override
    public double calcularPrecio() {

        double precioTotal = 0.0;
        for (Servicio serv : servicios) {
            precioTotal += serv.calcularPrecio();
        }

        return precioTotal - (precioTotal * descuento / 100);

    }

    public void agregarServicio(Servicio s) {
        this.servicios.add(s);
    }

    public void eliminarServicio(Servicio s) {
        this.servicios.remove(s);
    }

}
