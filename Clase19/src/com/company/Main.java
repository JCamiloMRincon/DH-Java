package com.company;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Almacen miAlmacen = new Almacen();

        Producto miCaja = ProductoFactory.getInstance().crearProducto("CAJA10X10");
        Producto miJabulani = ProductoFactory.getInstance().crearProducto("PELOTAFUTBOL");
        Producto miPelotaVerde = ProductoFactory.getInstance().crearProducto("PELOTATENIS");

        DecimalFormat decFor = new DecimalFormat("#.##");

        miAlmacen.addProducto(miCaja);
        miAlmacen.addProducto(miJabulani);
        miAlmacen.addProducto(miPelotaVerde);

        System.out.println("El espacio de la caja es: " +
                           decFor.format(miCaja.calcularEspacio()) + " cm3");
        System.out.println("El espacio de la pelota de fútbol es: " +
                           decFor.format(miJabulani.calcularEspacio()) + " cm3");
        System.out.println("El espacio de la pelota de tennis es: " +
                           decFor.format(miPelotaVerde.calcularEspacio()) + " cm3");

        System.out.println("El espacio requerido en el almacén es: " +
                           decFor.format(miAlmacen.calcularEspacioNecesario()) + " cm3");

    }
}
