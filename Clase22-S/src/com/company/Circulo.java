package com.company;

import static java.lang.Math.PI;

public class Circulo implements Figura {

    private double radio;

    public Circulo(double radio) throws Exception {
        if (radio <= 0) {
            throw new Exception("Please type positive parameters.");
        }
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return (PI * Math.pow(radio, 2));
    }

}
