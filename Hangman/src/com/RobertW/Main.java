package com.RobertW;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String[] Answer = {"E", "L", "E", "P", "H", "A", "N", "T"};/* To change the Answer, write your answer
                                                                    inside the {} brackets like it is done in the example */
        int[] SecondTable = new int[Answer.length];
        for (int i = 0;i < Answer.length;i++){
            SecondTable[i] = 0;
        }
        int numberOfWords = Answer.length;
        Scanner scanner = new Scanner(System.in);
        int NumberOfMistakes = 0;
        boolean isIncorrect;
        int numberOfCorrectAnswers = 0;
        String typedChars= "";
        while (true) {
            System.out.println();
            System.out.println("WELCOME TO HANGMAN");
            System.out.println("   _________     ");
            System.out.println("  |         |    ");
            System.out.println("  |         0    ");
            System.out.println("  |        /|\\  ");
            System.out.println("  |        / \\  ");
            System.out.println("  |              ");
            System.out.println(" / \\            ");
            System.out.println("type 'Start' to begin");
            if (scanner.nextLine().equalsIgnoreCase("Start")){
                break;
            }

        }

        System.out.println("The answer consists of " + numberOfWords + "words");
        for (int i= 1; i <= numberOfWords; i++){
            System.out.print("_");
            System.out.print(" ");
        }
        while (true) {
            System.out.println();
            System.out.println("Please type a character");
            String firstLetter = scanner.nextLine();
            typedChars = typedChars + firstLetter + ",";
            System.out.println("You have already typed: " + typedChars);
            isIncorrect = true;
            int i = 0;

            while (true) {
                if (SecondTable[i] == 1) {
                    System.out.print(Answer[i]);
                    System.out.print(" ");
                    i++;
                    continue;
                }

                if (firstLetter.equalsIgnoreCase(Answer[i])) {
                    System.out.print(Answer[i]);
                    System.out.print(" ");
                    isIncorrect = false;
                    SecondTable[i] = 1;
                    numberOfCorrectAnswers++;
                    i++;

                } else {
                    System.out.print("_");
                    System.out.print(" ");
                    i++;
                }

                if (i == numberOfWords) {
                    break;
                }
            }
            if (numberOfCorrectAnswers == Answer.length) {
                System.out.println();
                System.out.println("Congratulations, You Have Won!");
                break;
            }

            if (isIncorrect) {
                    NumberOfMistakes++;
                System.out.println();
                System.out.println("                   Wrong");
                }else {
                System.out.println();
                System.out.println("                   Correct");
            }
            switch (NumberOfMistakes) {
                case 0:
                    break;
                case 1:
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("                /             ");
                    break;
                case 2:
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("                 / \\            ");
                    break;
                case 3:
                    System.out.println();
                    System.out.println();
                    System.out.println("                  |              ");
                    System.out.println("                  |              ");
                    System.out.println("                  |              ");
                    System.out.println("                  |              ");
                    System.out.println("                  |              ");
                    System.out.println("                 / \\            ");
                    break;
                case 4:
                    System.out.println();
                    System.out.println("                   _________     ");
                    System.out.println("                  |              ");
                    System.out.println("                  |              ");
                    System.out.println("                  |              ");
                    System.out.println("                  |              ");
                    System.out.println("                  |              ");
                    System.out.println("                 / \\            ");
                    break;
                case 5:
                    System.out.println();
                    System.out.println("                   _________     ");
                    System.out.println("                  |         |    ");
                    System.out.println("                  |              ");
                    System.out.println("                  |              ");
                    System.out.println("                  |              ");
                    System.out.println("                  |              ");
                    System.out.println("                 / \\            ");
                    break;
                case 6:
                    System.out.println();
                    System.out.println("                   _________     ");
                    System.out.println("                  |         |    ");
                    System.out.println("                  |         O    ");
                    System.out.println("                  |              ");
                    System.out.println("                  |              ");
                    System.out.println("                  |              ");
                    System.out.println("                 / \\            ");
                    break;
                case 7:
                    System.out.println();
                    System.out.println("                   _________     ");
                    System.out.println("                  |         |    ");
                    System.out.println("                  |         O    ");
                    System.out.println("                  |         |    ");
                    System.out.println("                  |              ");
                    System.out.println("                  |              ");
                    System.out.println("                 / \\            ");
                    break;
                case 8:
                    System.out.println();
                    System.out.println("                   _________     ");
                    System.out.println("                  |         |    ");
                    System.out.println("                  |         O    ");
                    System.out.println("                  |        /|    ");
                    System.out.println("                  |              ");
                    System.out.println("                  |              ");
                    System.out.println("                 / \\            ");
                    break;
                case 9:
                    System.out.println();
                    System.out.println("                   _________     ");
                    System.out.println("                  |         |    ");
                    System.out.println("                  |         O    ");
                    System.out.println("                  |        /|\\   ");
                    System.out.println("                  |              ");
                    System.out.println("                  |              ");
                    System.out.println("                 / \\            ");
                    break;
                case 10:
                    System.out.println();
                    System.out.println("                   _________     ");
                    System.out.println("                  |         |    ");
                    System.out.println("                  |         O    ");
                    System.out.println("                  |        /|\\   ");
                    System.out.println("                  |        /     ");
                    System.out.println("                  |              ");
                    System.out.println("                 / \\            ");
                    break;
                case 11:
                    System.out.println();
                    System.out.println("                   GAME OVER    ");
                    System.out.println("                   _________     ");
                    System.out.println("                  |         |    ");
                    System.out.println("                  |         O    ");
                    System.out.println("                  |        /|\\  ");
                    System.out.println("                  |        / \\  ");
                    System.out.println("                  |              ");
                    System.out.println("                 / \\            ");
                    break;
            }


            if (NumberOfMistakes == 11) {
                System.out.println("YOU LOST");
                break;
            }

        }







    }
}
