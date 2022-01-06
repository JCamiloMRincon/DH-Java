package com.company;

import java.util.ArrayList;
import java.util.List;

public class Almacen {

    private List<Producto> productos;

    public Almacen() {
        this.productos = new ArrayList<>();
    }

    public void addProducto (Producto prod) {
        productos.add(prod);
    }

    public double calcularEspacioNecesario() {

        double volumenTotal = 0.0;
        for(Producto prod : productos) {
            volumenTotal += prod.calcularEspacio();
        }
        return volumenTotal;
    }

}
