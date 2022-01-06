package com.company;

public class Triangulo implements Figura {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) throws Exception {
        if (base <= 0 || altura <= 0) {
            throw new Exception("Please type positive parameters.");
        }
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return (0.5 * base * altura);
    }

}
