package com.company;

public class ProductoFactory {

    private static ProductoFactory instance;

    private ProductoFactory() {}

    public static ProductoFactory getInstance() {
        if (instance == null)
            instance = new ProductoFactory();
        return instance;
    }

    public Producto crearProducto(String cod) {

        Producto prod = null;

        switch (cod) {
            case "CAJA10X10":
                prod = new Caja(10.0,10.0,10.0);
                break;
            case "PELOTAFUTBOL":
                prod = new Pelota(11.0);
                break;
            case "PELOTATENIS":
                prod = new Pelota(0.32);
                break;
        }

        return prod;
    }
}
