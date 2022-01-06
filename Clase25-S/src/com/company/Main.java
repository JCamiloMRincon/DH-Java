package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Usuario usuario1 = new Usuario("Jorge", "Perez");
        Usuario usuario2 = new Usuario("Camilo", "Perez");

        Seguidor seguidor1 = new Seguidor("Juan","Perez");
        Seguidor seguidor2 = new Seguidor("Andres","Perez");
        Seguidor seguidor3 = new Seguidor("Pedro","Perez");

        usuario1.agregar(seguidor1);
        usuario1.agregar(seguidor2);

        usuario2.agregar(seguidor2);
        usuario2.agregar(seguidor3);

        usuario1.notificarSeguidores();
        usuario2.notificarSeguidores();

    }
}
