package com.company;

import java.util.ArrayList;
import java.util.List;

public class Combinada extends Habilidad {

    private List<Habilidad> habilidades;
    private double factor;

    public Combinada() {
        this.habilidades = new ArrayList<>();
    }

    public void agregarHabilidad(Habilidad h) {
        habilidades.add(h);
    }

    public void eliminarHabilidad(Habilidad h) {
        habilidades.remove(h);
    }

    public double getFactor() {
        return factor;
    }

    public void setFactor(double factor) throws Exception {
        if (factor < 0) {
            throw new Exception("El factor debe ser positivo.");
        }
        this.factor = factor;
    }

    @Override
    public double calcularPuntaje() {
        double puntajeTotal = 0.0;

        for (Habilidad habilidad : habilidades)
            puntajeTotal += habilidad.calcularPuntaje();

        return puntajeTotal * this.factor;
    }

}
