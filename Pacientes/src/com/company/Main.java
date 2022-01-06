package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        try {
            Paciente paciente = new Paciente
                                ("Juan","Perez","12345",
                                new Date(125,10,24));
            paciente.darAlta(new Date(120, 11, 24));
        } catch(PacienteException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("OK");

    }
}
