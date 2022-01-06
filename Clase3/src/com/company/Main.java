package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        
        Scanner scan = new Scanner(System.in);

        // EXERCISE: FEEDING THE PUPPIES
        System.out.print("Please type the name of the pet: ");
        String petName = scan.nextLine();

        System.out.print("How much does the pet eat?: ");
        Double foodQuantity = scan.nextDouble();

        Integer packagesQuantity = howManyPackagesDoINeed(foodQuantity);
        System.out.println(petName + " eats: " + packagesQuantity + " packages of food");

        // CHALLENGE 1
        System.out.print("Type first player's name: ");
        String nameFirstPlayer = scan.nextLine();
        System.out.print("Type second player's name: ");
        String nameSecondPlayer = scan.nextLine();

        System.out.print(nameFirstPlayer + ", please, choose rock, paper or scissors: ");
        String moveFirstPlayer = scan.nextLine();
        System.out.print(nameSecondPlayer + ", please, choose rock, paper or scissors: ");
        String moveSecondPlayer = scan.nextLine();

        int scoreFirstPlayer = 0;
        int scoreSecondPlayer = 0;

        while (!moveFirstPlayer.equals("*")) {

            if (whoWins(moveFirstPlayer, moveSecondPlayer) == 1) {
                scoreFirstPlayer++;
                System.out.println("The winner of this round is: " + nameFirstPlayer);
            } else if (whoWins(moveFirstPlayer, moveSecondPlayer) == 2){
                scoreSecondPlayer++;
                System.out.println("The winner of this round is: " + nameSecondPlayer);
            } else {
                System.out.println("There is a tie between: " + nameFirstPlayer + " and " + nameSecondPlayer);
            }

            System.out.println(nameFirstPlayer + " score: " + scoreFirstPlayer);
            System.out.println(nameSecondPlayer + " score: " + scoreSecondPlayer);

            System.out.print(nameFirstPlayer + ", please, choose rock, paper or scissors: ");
            moveFirstPlayer = scan.nextLine();

            if (!moveFirstPlayer.equals("*")) {
                System.out.print(nameSecondPlayer + ", please, choose rock, paper or scissors: ");
                moveSecondPlayer = scan.nextLine();
            }

        }

        // CHALLENGE 2
        /* System.out.print("Type first player's name: ");
        String nameFirstPlayer = scan.nextLine();
        System.out.print("Type second player's name: ");
        String nameSecondPlayer = scan.nextLine();

        System.out.print(nameFirstPlayer + ", please, choose rock, paper, scissors or spock: ");
        String moveFirstPlayer = scan.nextLine();
        System.out.print(nameSecondPlayer + ", please, choose rock, paper, scissors or spock: ");
        String moveSecondPlayer = scan.nextLine();

        int scoreFirstPlayer = 0;
        int scoreSecondPlayer = 0;

        while (!moveFirstPlayer.equals("*")) {

            if (whoWinsSpock(moveFirstPlayer, moveSecondPlayer) == 1) {
                scoreFirstPlayer++;
                System.out.println("The winner of this round is: " + nameFirstPlayer);
            } else if (whoWinsSpock(moveFirstPlayer, moveSecondPlayer) == 2) {
                scoreSecondPlayer++;
                System.out.println("The winner of this round is: " + nameSecondPlayer);
            } else {
                System.out.println("There is a tie between: " + nameFirstPlayer + " and " + nameSecondPlayer);
            }

            System.out.println(nameFirstPlayer + " score: " + scoreFirstPlayer);
            System.out.println(nameSecondPlayer + " score: " + scoreSecondPlayer);

            System.out.print(nameFirstPlayer + ", please, choose rock, paper, scissors or spock: ");
            moveFirstPlayer = scan.nextLine();

            if (!moveFirstPlayer.equals("*")) {
                System.out.print(nameSecondPlayer + ", please, choose rock, paper, scissors or spock: ");
                moveSecondPlayer = scan.nextLine();
            }

        } */

        // CHALLENGE 3
        System.out.print("Please type a number: ");
        int numberOfPrimes = scan.nextInt();

        int count = 0;
        int number = 2;

        System.out.println("The first " + numberOfPrimes + " prime numbers are: ");
        while(count < numberOfPrimes) {
            if(isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }

        // CHALLENGE 4
        System.out.print("Type the number of hours: ");
        Integer numberHours = scan.nextInt();

        System.out.println("Julieta's weekly salary is: " + weeklySalary(numberHours));

    }

    // FUNCTION EXERCISE: FEEDING THE PUPPIES
    public static Integer howManyPackagesDoINeed(Double foodQuantity) {

        Scanner reader;
        reader = new Scanner(System.in);

        double currentFood = 0.0;
        Integer packagesQuantity = 0;

        while(currentFood < foodQuantity) {
            System.out.print("Type the package weight: ");
            double packageWeight = reader.nextDouble();
            currentFood += packageWeight;
            packagesQuantity++;
        }

        return packagesQuantity;

    }

    // FUNCTION CHALLENGE 1
    public static Integer whoWins(String firstPlayer, String secondPlayer) {

        if (firstPlayer.equals(secondPlayer)) {
            return 0;
        } else if (firstPlayer.equals("Rock") && secondPlayer.equals("Scissors") ||
                   firstPlayer.equals("Paper") && secondPlayer.equals("Rock") ||
                   firstPlayer.equals("Scissors") && secondPlayer.equals("Paper")) {
            return 1;
        } else {
            return 2;
        }

    }

    // FUNCTION CHALLENGE 2
    public static Integer whoWinsSpock(String firstPlayer, String secondPlayer) {

        if (firstPlayer.equals(secondPlayer)) {
            return 0;
        } else if (firstPlayer.equals("Rock") && secondPlayer.equals("Scissors") ||
                   firstPlayer.equals("Paper") && secondPlayer.equals("Rock") ||
                   firstPlayer.equals("Scissors") && secondPlayer.equals("Paper") ||
                   firstPlayer.equals("Spock") && secondPlayer.equals("Scissors") ||
                   firstPlayer.equals("Spock") && secondPlayer.equals("Stone")) {
            return 1;
        } else {
            return 2;
        }

    }

    // FUNCTION CHALLENGE 3
    public static boolean isDivisible(int dividend, int divisor) {
        return dividend % divisor == 0;
    }

    public static boolean isPrime(int number) {

        if(number == 0 || number == 1) {
            return false;
        } else {
            for (int i = 2; i < number/2 + 1; i++) {
                if (isDivisible(number, i)) {
                    return false;
                }
            }
        }

        return true;

    }

    // FUNCTION CHALLENGE 4
    public static Double weeklySalary(Integer numberHours) {

        double valueHour = 875.0;
        if(numberHours <= 40) {
            return numberHours * valueHour;
        } else {
            Double extraValue = valueHour * 1.5;
            Integer extraHours = numberHours - 40;
            return (valueHour * 40) + (extraValue * extraHours);
        }

    }

}
