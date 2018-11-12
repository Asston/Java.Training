package com.RobertW;
//Description
//        5 Friends (let's call them a, b, c, d and e) are playing a game and need to keep track of the scores. Each time someone scores a point, the letter of his name is typed in lowercase. If someone loses a point, the letter of his name is typed in uppercase. Give the resulting score from highest to lowest.
//
//        Input Description
//        A series of characters indicating who scored a point. Examples:
//
//        abcde
//        dbbaCEDbdAacCEAadcB
//        Output Description
//        The score of every player, sorted from highest to lowest. Examples:
//
//        a:1, b:1, c:1, d:1, e:1
//        b:2, d:2, a:1, c:0, e:-2
//        Challenge Input
//        EbAAdbBEaBaaBBdAccbeebaec
public class Main {

    public static void main(String[] args) {
        String str = "EbAAdbBEaBaaBBdAccbeebaec"; //challenge input

        char[] charArray = str.toCharArray();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;

        for (char i = 0; i<charArray.length;i++){
            switch (charArray[i]){
                case 'a':
                    a++;
                    break;
                case 'A':
                    a--;
                    break;
                case 'b':
                    b++;
                    break;
                case 'B':
                    b--;
                    break;
                case 'c':
                    c++;
                    break;
                case 'C':
                    c--;
                    break;
                case 'd':
                    d++;
                    break;
                case 'D':
                    d--;
                    break;
                case 'e':
                    e++;
                    break;
                case 'E':
                    e--;
                    break;


            }
        }

        System.out.println("Player a scored " + a + " points");
        System.out.println("Player b scored " + b + " points");
        System.out.println("Player c scored " + c + " points");
        System.out.println("Player d scored " + d + " points");
        System.out.println("Player e scored " + e + " points");
        System.out.println();
        if (a>b && a>c && a>d && a>e) System.out.println("Player a has Won");
        else if (b>a && b>c && b>d && b>e) System.out.println("Player b has Won");
        else if (c>a && c>b && c>d && c>e) System.out.println("Player c has Won");
        else if (d>a && d>b && d>c && d>e) System.out.println("Player d has Won");
        else if (e>a && e>b && e>c && e>d) System.out.println("Player e has Won");
        else System.out.println("There was no winner");
    }




}
