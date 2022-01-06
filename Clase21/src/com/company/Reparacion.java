package com.company;

public class Reparacion {

    private Estado estado;
    private String nombreArticulo;
    private double costo;
    private String direccionEntrega;

    public Reparacion(String nombreArticulo) {
        this.estado = new Presupuesto();
        this.nombreArticulo = nombreArticulo;
        System.out.println(this.toString());
    }

    public void asignarPresupuesto(double valor) {
        this.estado.darValorPresupuesto(valor);
        if (this.estado.getNombre().equals("Presupuesto"))
            this.costo = valor;
    }

    public void agregarRepuesto(double valor) {
        this.estado.agregarRepuesto(valor);
        if (this.estado.getNombre().equals("En Reparacion"))
            this.costo += valor;
    }

    public void cambiarDireccion(String direccion) {
        this.estado.cambiarDireccion(direccion);
        if (this.estado.getNombre().equals("Para Envio"))
            this.direccionEntrega = direccion;
    }

    public void cambiarEstado() {
        estado = estado.siguientePaso();
        System.out.println(this.toString());
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public double getCosto() {
        return costo;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public Estado getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Reparacion {" +
                " estado = " + estado.getNombre() +
                ", nombreArticulo = '" + nombreArticulo + '\'' +
                ", costo = " + costo +
                ", direccionEntrega = '" + direccionEntrega + '\'' +
                '}';
    }

}
