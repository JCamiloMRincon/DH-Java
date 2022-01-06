package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dueno primerDueno = new Dueno("Pepito","Perez","123456");
        Dueno segundoDueno = new Dueno("Camilo","Mortigo","987654");

        Propiedad miPropiedad;

        // Uso de los métodos de la clase Campo.
        miPropiedad = new Campo(primerDueno, new Date(), 100000.0,"Calle 3",true,
                      true,11.0);
        System.out.println("¿Se puede vender?: " + miPropiedad.poderVender());
        System.out.println("¿Se puede cultivar?: " + ((Campo) miPropiedad).aptoCultivo());

        // Polimorfismo.
        miPropiedad = new Casa(segundoDueno, new Date(), 25000.0,"Avenida Siempre Viva",
                     false, 4,100.5);
        // Se define una casa nueva, para compararalas.
        Casa unaCasa = new Casa(primerDueno, new Date(), 50000.0,"Casterly Rock",
                     true, 4,75.4);

        //Comparación de las casas.
        int comparacionCasas = ((Casa) miPropiedad).compareTo(unaCasa);
        if (comparacionCasas > 0) {
            System.out.println("La casa de: " + miPropiedad.getDueno().getNombre() + " " +
                              miPropiedad.getDueno().getApellido() + " tiene más ambientes");
        } else {
            if (comparacionCasas < 0) {
                System.out.println("La casa de: " + unaCasa.getDueno().getNombre() + " " +
                                   unaCasa.getDueno().getApellido() + " tiene más ambientes");
            } else {
                System.out.println("Las dos casas tienen la misma cantidad de ambientes");
            }
        }

    }
}
