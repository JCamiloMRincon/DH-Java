package com.company;

public class Simple extends Servicio {

    private double precio;

    public void setPrecio(double precio) throws Exception {
        if (precio < 0)
            throw new Exception("El precio debe ser positivo.");
        this.precio = precio;
    }

    @Override
    public double calcularPrecio() {
        if (this.getNombre().equals("Colocación"))
            return this.precio + (this.precio * 0.1);
        return this.precio;
    }

}
