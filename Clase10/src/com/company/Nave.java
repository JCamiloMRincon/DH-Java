package com.company;

public class Nave extends Objeto{

    private double velocidad;
    private int vida;

    public Nave(int posx, int posy, char direccion, double velocidad) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida = 3;
    }

    @Override
    public void irA(int x, int y, char direccion) {
        if (this.getDireccion() != direccion) {
            this.girar(direccion);
        }
        this.setPosx(x);
        this.setPosy(y);
    }

    public void girar(char direccion) {
        this.setDireccion(direccion);
    }

}
