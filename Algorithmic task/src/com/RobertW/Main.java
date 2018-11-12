package com.RobertW;
//Task:
//        Write a function that receives two sequences: A and B of integers and returns one sequence C. Sequence C should contain all elements from sequence A (maintaining the order) except those, that are present in sequence B p times, where p is a prime number.
//
//        Example:
//        A=[2,3,9,2,5,1,3,7,10]
//        B=[2,1,3,4,3,10,6,6,1,7,10,10,10]
//        C=[2,9,2,5,7,10]

public class Main {

    public static void main(String[] args) {
        int[] seqA = {2, 3, 9, 2, 5, 1, 3, 7, 10};
        int[] seqB = {2, 1, 3, 4, 3, 10, 6, 6, 1, 7, 10, 10, 10};

        returnValue(seqA, seqB);


    }


    public static int returnValue(int[] first, int[] second) {
        int n;

        int count = 0;

        for (int i = 0; i < second.length; i++) {
            n = 0;
            int a = second[i];
            for (int j = 0; j < second.length; j++) {
                if (a == second[j]) {
                    n++;
                }
            }
            if (isPrime(n)) {
                for (int j = 0; j < first.length; j++) {
                    if (first[j] == a) {
                        first[j] = -1;
                    }
                }
            }

        }

        for (int i = 0; i < first.length; i++) {
            if (first[i] == -1)
                count++;
        }

        int finalArrayLength = first.length - count;
        int j = 0;
        int[] finalArray = new int[finalArrayLength];
        for (int i = 0; i < finalArrayLength; i++) {

            while (true) {
                if (first[j] != -1) {
                    finalArray[i] = first[j];
                    j++;
                    break;
                }
                j++;

            }
        }


        for (int element : finalArray)
            System.out.println(element);
        return 1;

    }


    public static boolean isPrime(int n) {
        if (n == 0 || n == 1)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


}
