package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Exercise 1: String
        String text1 = "This is my first String Object";
        String text2 = "This is my first String Object";

        System.out.println("---ASYNCHRONOUS LESSON: EXERCISE 1---");
        System.out.println("Are the Strings equal?: " + text1.equals(text2));

        // Exercise 2: Integer
        Integer number1 = 3;
        Integer number2 = 3;

        System.out.println("---ASYNCHRONOUS LESSON: EXERCISE 2---");
        if (number1.compareTo(number2) > 0) {
            System.out.println("The greater number is: " + number1);
        } else if (number1.compareTo(number2) < 0) {
            System.out.println("The greater number is: " + number2);
        } else {
            System.out.println("Both numbers are equal");
        }

        // Exercise 3: Data entry
        Scanner reader;
        reader = new Scanner(System.in);

        String firstName;
        String lastName;
        String initials;

        System.out.println("---ASYNCHRONOUS LESSON: EXERCISE 3---");
        System.out.print("Please type your name: ");
        firstName = reader.nextLine();
        System.out.print("Please type your last name: ");
        lastName = reader.nextLine();

        initials = firstName.charAt(0) + String.valueOf(lastName.charAt(0));

        System.out.println("You initials are: " + initials);

        // Exercise 4: Functions
        System.out.println("---ASYNCHRONOUS LESSON: EXERCISE 4---");
        System.out.println("Are both numbers divisible?: " + isDivisible(9,3));

        // Sync lesson - exercise 1
        int primeNumber;

        System.out.println("---SYNCHRONOUS LESSON: EXERCISE 1---");
        System.out.print("Type a number: ");
        primeNumber = reader.nextInt();
        System.out.println("Is it a prime number?: " + isPrime(primeNumber));

        // Sync lesson - exercise 2
        int firstNumber;
        int secondNumber;
        int thirdNumber;

        System.out.println("---SYNCHRONOUS LESSON: EXERCISE 2---");
        System.out.print("Type the first number: ");
        firstNumber = reader.nextInt();
        System.out.print("Type the second number: ");
        secondNumber = reader.nextInt();
        System.out.print("Type the last number: ");
        thirdNumber = reader.nextInt();

        System.out.println("The greatest number among " + firstNumber + ", " + secondNumber +
                           " and " + thirdNumber + " is: " +
                           maximumAmongThreeNumbers(firstNumber, secondNumber, thirdNumber));

        // Sync lesson - exercise 3
        String firstText;
        String secondText;

        System.out.println("---SYNCHRONOUS LESSON: EXERCISE 3---");
        System.out.print("Type the first text: ");
        firstText = reader.next();
        System.out.print("Type the last text: ");
        secondText = reader.next();

        System.out.println("Are both texts equal?: " + differentStrings(firstText, secondText));

    }

    // Exercise 4: Functions
    public static boolean isDivisible(int dividend, int divisor) {
        return dividend % divisor == 0;
    }

    // Sync lesson - exercise 1
    public static boolean isPrime(int number) {

        if(number == 0 || number == 1) {
            return false;
        } else {
            for (int i = 2; i < number/2; i++) {
                if ( isDivisible(number, i) ) {
                    return false;
                }
            }
        }

        return true;

    }

    // Sync lesson - exercise 2
    public static Integer maximumAmongThreeNumbers(Integer numberA, Integer numberB, Integer numberC) {

        if (numberA.compareTo(numberB) > 0 && numberA.compareTo(numberC) > 0) {
            return numberA;
        } else {
            if (numberB.compareTo(numberC) > 0) {
                return numberB;
            } else {
                return numberC;
            }
        }

    }

    // Sync lesson - exercise 3
    public static boolean differentStrings(String textA, String textB) {
        return textA.equals(textB);
    }

}
