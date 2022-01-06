package com.company;

public class Asteroide extends Objeto{

    private int lesion;

    public Asteroide(int posx, int posy, char direccion, int lesion) {
        super(posx, posy, direccion);
        this.lesion = lesion;
    }

    @Override
    public void irA(int x, int y, char direccion) {
        this.setPosx(x);
        this.setPosy(y);
    }

}
