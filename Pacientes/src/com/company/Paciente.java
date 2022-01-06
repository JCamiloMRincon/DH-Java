package com.company;

import java.util.Date;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;


    Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion) throws PacienteException{
        Date hoy = new Date();
        this.nombre = nombre;
        this.apellido = apellido;
        fechaAlta = null;
        if (fechaInternacion.after(hoy))
            throw new PacienteException("ERROR: La fecha de internación no puede ser después a la de hoy");
        this.fechaInternacion = fechaInternacion;
    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta) throws PacienteException{
        if (fechaAlta.before(fechaInternacion))
            throw new PacienteException("ERROR: La fecha de alta no puede ser antes a la de hoy");
    }



}
