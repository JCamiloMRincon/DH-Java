package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Reserva reserva1 = new Reserva("1",4,"Buenos Aires","Bogotá");
        Reserva reserva2 = new Reserva("2",5,"Luján","Buenos Aires");
        Reserva reserva3 = new Reserva("3",6,"Buenos Aires","Bragado");
        Reserva reserva4 = new Reserva("4",9,"Tunja","Buenos Aires");

        System.out.println(reserva1.getPrecio());
        System.out.println(reserva2.getPrecio());
        System.out.println(reserva3.getPrecio());
        System.out.println(reserva4.getPrecio());

        Empresa empresa = new Empresa();
        empresa.addReserva(reserva1);
        empresa.addReserva(reserva2);
        empresa.addReserva(reserva3);
        empresa.addReserva(reserva4);

        try {
            System.out.println(empresa.cantVecesRecorrida("Bragado"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
