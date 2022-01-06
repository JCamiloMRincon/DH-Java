package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Auto auto = new Auto("ABC126", "Ford", "Mustang");
        Chofer chofer = new Chofer("Juan", "Perez", auto);

        System.out.println("Patente asignada: " + chofer.verPatente());
    }
}
