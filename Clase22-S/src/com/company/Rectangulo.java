package com.company;

public class Rectangulo implements Figura {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) throws Exception {
        if (base <= 0 || altura <= 0) {
            throw new Exception("Please type positive parameters.");
        }
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return (base * altura);
    }

}
