package com.company;

public class Simple extends Habilidad {

    private double puntaje;

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) throws Exception {
        if (puntaje < 0) {
            throw new Exception("El puntaje debe ser positivo.");
        }
        this.puntaje = puntaje;
    }

    @Override
    public double calcularPuntaje() {
        if (this.getNombre().equals("Disparar"))
            return this.puntaje + (this.puntaje * 0.1);
        return this.puntaje;
    }

}
