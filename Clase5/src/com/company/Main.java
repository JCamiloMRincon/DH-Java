package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /* Cliente primerCliente = new Cliente(12, "Camilo");
        primerCliente.incrementarDeuda(500.0);
        primerCliente.incrementarDeuda(1000.0);

        System.out.printf("¿Cuál es la deuda?: " + primerCliente.getDeuda()); */

        // Ejercicio UsuarioJuego
        UsuarioJuego primerJugador = new UsuarioJuego("primerJugador","123");
        System.out.println("El nivel del jugador es: " + primerJugador.getNivel());
        primerJugador.subirNivel();
        System.out.println("El nivel del jugador es: " + primerJugador.getNivel());
        primerJugador.bonusNivel(4);
        System.out.println("El nivel del jugador es: " + primerJugador.getNivel());

        System.out.println("El puntaje del jugador es: " + primerJugador.getPuntaje());
        primerJugador.aumentarPuntaje();
        System.out.println("El puntaje del jugador es: " + primerJugador.getPuntaje());
        primerJugador.bonus(6);
        System.out.println("El puntaje del jugador es: " + primerJugador.getPuntaje());

    }

}
