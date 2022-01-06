package com.company;

public class Main {

    public static void main(String[] args) {
	// Exercise 1: structures
        int dividend = 25;
        int divisor = 3;
        if (dividend % divisor == 0) {
            System.out.println("The quotient between " + dividend + " and " + divisor +
                               " is: " + dividend / divisor);
        } else {
            System.out.println("The division is not exact because the modulus is: " + dividend % divisor);
        }

    }

}
