package com.company;

import java.util.Date;

public class Campo extends Propiedad {

    private boolean tieneCasco;
    private double cantidadHectareas;

    public Campo(Dueno dueno, Date fechaAdquisicion, double precio, String direccion, boolean hipotecada, boolean tieneCasco, double cantidadHectareas) {
        super(dueno, fechaAdquisicion, precio, direccion, hipotecada);
        this.tieneCasco = tieneCasco;
        this.cantidadHectareas = cantidadHectareas;
    }

    public boolean aptoCultivo() {
        return (this.cantidadHectareas > 10.0);
    }

}
