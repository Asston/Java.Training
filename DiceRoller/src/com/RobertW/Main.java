package com.RobertW;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the input in format of XdY, when X represents number of dice and Y represents " +
                            "number of sides of a die ");

        String string = scanner.nextLine();
        String[] parts = string.split("d");
        String part1 = parts[0]; //the part before d
        String part2 = parts[1]; //the part after d

        int numberOfDice = Integer.parseInt(part1);
        int diceSides = Integer.parseInt(part2);
        int theSum = 0;
        int upper = diceSides +1;
        int lower = 1;

        for (int i = 0; i<numberOfDice;i++){

            int r = (int) (Math.random() * (upper - lower)) + lower;
            theSum +=r;
        }
        System.out.println("the sum is " + theSum);
    }
}
