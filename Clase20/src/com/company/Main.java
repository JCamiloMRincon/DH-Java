package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Carrito miPrimerCarrito = new Carrito();

        Producto agua = new Producto("Agua sin gas",2000.0);
        Producto cafe = new Producto("Cafe",3000.0);
        Producto cerveza = new Producto("Cerveza Águila", 18000.0);

        miPrimerCarrito.agregarProducto(agua);
        miPrimerCarrito.agregarProducto(cafe);

        System.out.println(miPrimerCarrito.getEstado().getNombre());

        //Pasar a cargando
        miPrimerCarrito.pasarSiguiente();
        System.out.println(miPrimerCarrito.getProductos().size());

        //Pasar a pagando
        miPrimerCarrito.pasarSiguiente();
        miPrimerCarrito.agregarProducto(cerveza);
        System.out.println(miPrimerCarrito.getProductos().size());

        //Cancelar carrito
        miPrimerCarrito.cancelar();
        System.out.println(miPrimerCarrito.getProductos().size());

    }

}
