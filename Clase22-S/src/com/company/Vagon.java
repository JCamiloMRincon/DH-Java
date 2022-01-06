package com.company;

import java.util.ArrayList;
import java.util.List;

public class Vagon implements Figura{

    private List<Figura> figuras = new ArrayList<>();

    public void addFigura(Figura f) {
        figuras.add(f);
    }

    public void showFiguras() {
        for (Figura figura : figuras) {
            System.out.println("Figura geométrica: " + figura.getClass().getSimpleName() +
                    ", área: " + figura.getArea());
        }
    }

    public void removeFigura(Figura f) {
        figuras.remove(f);
    }

    @Override
    public double getArea() {
        double areaTotal = 0.0;
        for (Figura figura : figuras) {
            areaTotal += figura.getArea();
        }
        return areaTotal;
    }

}
