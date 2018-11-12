package com.RobertW;

//Create a Dice Roller
//        Description
//        I love playing D&D with my friends, and my favorite part is creating character sheets (my DM is notorious for killing us all off by level 3 or so). One major part of making character sheets is rolling the character's stats. Sadly, I have lost all my dice, so I'm asking for your help to make a dice roller for me to use!
//
//        Formal Inputs & Outputs
//        Input description
//        Your input will contain one one line in the form of "NdM"; for example:
//
//        3d6
//        4d12
//        1d10
//        5d4
//        If you've ever played D&D you probably recognize those, but for the rest of you, this is what those mean:
//
//        The first number is the number of dice to roll, the d just means "dice", it's just used to split up the two numbers, and the second number is how many sides the dice have. So the above example of "3d6" means "roll 3 6-sided dice". Also, just in case you didn't know, in D&D, not all the dice we roll are the normal cubes. A d6 is a cube, because it's a 6-sided die, but a d20 has twenty sides, so it looks a lot closer to a ball than a cube.
//
//        The first number, the number of dice to roll, can be any integer between 1 and 100, inclusive.
//
//        The second number, the number of sides of the dice, can be any integer between 2 and 100, inclusive.
//
//        Output description
//        You should output the sum of all the rolls of that specified die, each on their own line. so if your input is "3d6", the output should look something like
//
//        14
//        Just a single number, you rolled 3 6-sided dice, and they added up to 14.
//
//        Challenge Input
//        5d12
//        6d4
//        1d2
//        1d8
//        3d6
//        4d20
//        100d100


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
