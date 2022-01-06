package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Reparacion miBatidora = new Reparacion("batidora");

        // Estado: en presupuesto
        miBatidora.asignarPresupuesto(2000.0);
        System.out.println(miBatidora.getCosto());

        // Estado: en reparación
        miBatidora.cambiarEstado();
        miBatidora.agregarRepuesto(500.0);
        System.out.println(miBatidora.getCosto());

        // Estado: para envío
        miBatidora.cambiarEstado();
        miBatidora.cambiarDireccion("Av. Siempre Viva");
        System.out.println(miBatidora.getDireccionEntrega());

    }
}
