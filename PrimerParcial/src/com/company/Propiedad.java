package com.company;

import java.util.Date;

public abstract class Propiedad {

    private Dueno dueno;
    private Date fechaAdquisicion;
    private double precio;
    private String direccion;
    private boolean hipotecada;

    public Propiedad(Dueno dueno, Date fechaAdquisicion, double precio, String direccion, boolean hipotecada) {
        this.dueno = dueno;
        this.fechaAdquisicion = fechaAdquisicion;
        this.precio = precio;
        this.direccion = direccion;
        this.hipotecada = hipotecada;
    }

    public boolean poderVender() {
        return (!this.hipotecada);
    }

    public Dueno getDueno() {
        return dueno;
    }

}
