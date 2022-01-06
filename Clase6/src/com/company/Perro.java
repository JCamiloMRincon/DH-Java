package com.company;

import java.time.LocalDate;

public class Perro {

    private boolean enAdopcion;
    private String raza;
    private int anioNacimiento;
    private double peso;
    private boolean tieneChip;
    private boolean estaLastimado;
    private String nombrePila;

    public Perro(boolean enAdopcion, String raza, int anioNacimiento, double peso, boolean tieneChip, boolean estaLastimado, String nombrePila) {
        this.enAdopcion = enAdopcion;
        this.raza = raza;
        this.anioNacimiento = anioNacimiento;
        this.peso = peso;
        this.tieneChip = tieneChip;
        this.estaLastimado = estaLastimado;
        this.nombrePila = nombrePila;
    }

    public boolean getEnAdopcion() {
        return enAdopcion;
    }

    public void setEnAdopcion(boolean enAdopcion) {
        this.enAdopcion = enAdopcion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isTieneChip() {
        return tieneChip;
    }

    public void setTieneChip(boolean tieneChip) {
        this.tieneChip = tieneChip;
    }

    public boolean isEstaLastimado() {
        return estaLastimado;
    }

    public void setEstaLastimado(boolean estaLastimado) {
        this.estaLastimado = estaLastimado;
    }

    public String getNombrePila() {
        return nombrePila;
    }

    public void setNombrePila(String nombrePila) {
        this.nombrePila = nombrePila;
    }

    public int preguntarEdad() {
        return (LocalDate.now().getYear() - this.anioNacimiento);
    }

    public boolean sePuedePerder() {
        if (this.tieneChip) {
            return false;
        } else {
            return true;
        }
    }

    public void enviarAdopcion() {
        if (this.estaLastimado == false && this.peso > 5.0) {
            this.enAdopcion = true;
        }
    }

}
