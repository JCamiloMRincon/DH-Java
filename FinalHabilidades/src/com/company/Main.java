package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Insertar la habilidad simple de saltar
        Habilidad saltar = HabilidadFactory.getInstance().cargarHabilidad(HabilidadFactory.SIMPLE);
        cargarHabilidad(saltar);

        // Insertar la habilidad simple de disparar.
        Habilidad disparar = HabilidadFactory.getInstance().cargarHabilidad(HabilidadFactory.SIMPLE);
        cargarHabilidad(disparar);

        // Insertar la habilidad combinada de saltar y disparar
        Habilidad dispararSaltar = HabilidadFactory.getInstance().cargarHabilidad(HabilidadFactory.COMBINADA);
        cargarHabilidad(dispararSaltar);

        agregarHabilidad(dispararSaltar, saltar);
        agregarHabilidad(dispararSaltar, disparar);

        Personaje MarioBros = new Personaje("Mario");

        MarioBros.agregarHabilidad(saltar);
        MarioBros.agregarHabilidad(disparar);
        MarioBros.agregarHabilidad(dispararSaltar);

        MarioBros.mostrarHabilidades();

    }

    public static void cargarHabilidad(Habilidad h) {

        Scanner sc = new Scanner(System.in);
        Simple habilidadSimple;
        Combinada habilidadCombinada;

        System.out.println("Digite el nombre de la habilidad: ");
        h.setNombre(sc.nextLine());

        if (h instanceof Simple) {
            habilidadSimple = (Simple) h;

            System.out.println("Digite el puntaje de la habilidad: ");
            try {
                habilidadSimple.setPuntaje(sc.nextDouble());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        if (h instanceof Combinada) {
            habilidadCombinada = (Combinada) h;

            System.out.println("Digite el factor multiplicador: ");
            try {
                habilidadCombinada.setFactor(sc.nextDouble());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }

    public static void agregarHabilidad(Habilidad combinada, Habilidad simple) {

        if(combinada instanceof Combinada && simple instanceof Simple)
            ((Combinada) combinada).agregarHabilidad(simple);

    }

}
