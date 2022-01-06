package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Insertar el servicio simple de venta de aire acondicionado.
        Servicio aire = ServicioFactory.getInstance().cargarServicio(ServicioFactory.SIMPLE);
        cargarServicio(aire);

        // Insertar el servicio simple de colocación.
        Servicio colocacion = ServicioFactory.getInstance().cargarServicio(ServicioFactory.SIMPLE);
        cargarServicio(colocacion);

        // Insertar el servicio combinado de colocación y venta de aire acondicionado.
        Servicio colocarAire = ServicioFactory.getInstance().cargarServicio(ServicioFactory.COMBO);
        cargarServicio(colocarAire);

        // Agregar a la lista de servicios en el combo, los servicios simples.
        agregarServicio(colocarAire, aire);
        agregarServicio(colocarAire, colocacion);

        Empresa daikin = new Empresa();

        // Agregar los servicios simples y combinado a la empresa.
        daikin.agregarServicio(aire);
        daikin.agregarServicio(colocacion);
        daikin.agregarServicio(colocarAire);

        // Mostrar todos los servicios en pantalla.
        daikin.mostrarServicios();

    }

    public static void cargarServicio(Servicio s) {

        Scanner sc = new Scanner(System.in);
        Simple servicioSimple;
        Combo servicioCombo;

        System.out.println("Digite el nombre del servicio: ");
        s.setNombre(sc.nextLine());

        if (s instanceof Simple) {
            servicioSimple = (Simple) s;

            System.out.println("Digite el precio del servicio simple: ");
            try {
                servicioSimple.setPrecio(sc.nextDouble());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        if (s instanceof Combo) {
            servicioCombo = (Combo) s;

            System.out.println("Digite el porcentaje de descuento: ");
            try {
                servicioCombo.setDescuento(sc.nextDouble());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }

    public static void agregarServicio(Servicio combo, Servicio simple) {

        if(combo instanceof Combo && simple instanceof Simple)
            ((Combo) combo).agregarServicio(simple);
        else
            System.out.println("Error al cargar los datos.");
    }

}
