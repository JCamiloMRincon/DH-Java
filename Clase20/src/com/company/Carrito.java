package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private StateCarrito estado;
    private List<Producto> productos;

    public Carrito() {
        this.estado = new Vacio();
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto prod) {

        if (this.estado.getNombre().equals("Pagando") || this.estado.getNombre().equals("Cerrado")) {
            System.out.println("No se pueden cargar productos. Regrese al estado cargando o vacío.");
        } else {
            this.productos.add(prod);
            if(this.estado.getNombre().equals("Vacio"))
                this.estado.pasarAlSiguiente();
        }

    }

    public void cancelar() {
        this.estado = this.estado.cancelarCarrito();

        while (this.productos.size() > 0) {
            this.productos.remove(0);
        }

        System.out.println("El carrito queda cancelado. Su estado es: " + this.estado.getNombre());
    }

    public void regresar() {
        this.estado = this.estado.regresar();
        System.out.println("Ahora el carrito está: " + this.estado.getNombre());
    }

    public void pasarSiguiente() {
        this.estado = this.estado.pasarAlSiguiente();
        System.out.println("Ahora el carrito está: " + this.estado.getNombre());
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public StateCarrito getEstado() {
        return estado;
    }

}
