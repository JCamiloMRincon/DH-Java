package com.company;

import java.util.Date;

public class Casa extends Propiedad implements Comparable{

    private int cantidadAmbientes;
    private double metrosCuadrados;

    public Casa(Dueno dueno, Date fechaAdquisicion, double precio, String direccion, boolean hipotecada, int cantidadAmbientes, double metrosCuadrados) {
        super(dueno, fechaAdquisicion, precio, direccion, hipotecada);
        this.cantidadAmbientes = cantidadAmbientes;
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public int compareTo(Object o) {

        Casa miCasa = (Casa) o;
        return (this.cantidadAmbientes - miCasa.cantidadAmbientes);

    }

}
