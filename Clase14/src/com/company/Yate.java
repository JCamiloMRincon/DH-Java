package com.company;

public class Yate extends Embarcacion implements Comparable{

    private int cantidadCamarotes;

    public Yate(Capitan capitan, double precioBase, double valorAdicional, int anioFabricacion, double eslora, int cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, anioFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    @Override
    public int compareTo(Object o) {

        Yate miYate = (Yate) o;
        if (this.cantidadCamarotes > miYate.cantidadCamarotes) {
            return 1;
        } else if (this.cantidadCamarotes < miYate.cantidadCamarotes) {
            return -1;
        } else {
            return 0;
        }

    }
}
