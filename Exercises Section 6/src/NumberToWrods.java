public class NumberToWrods {
    public static void main(String[] args) {

        numberToWords(100);



    }


    public static void numberToWords (int number){
        if (number <0){
            System.out.println("Invalid Value");
        }

        int reversedNumber = reverse(number);
        int numberToPrint = 0;
        int originalDigitNumber = getDigitCount(number);
        int reversedDigitNumber = getDigitCount(reversedNumber);

        while(true){
            if (reversedNumber >=10){
                numberToPrint = reversedNumber % 10;
                Printing(numberToPrint);
                reversedNumber /= 10;
                continue;
            }
            numberToPrint = reversedNumber;
            Printing(numberToPrint);

            break;


        }
        while (true) {
            if (originalDigitNumber > reversedDigitNumber) {
                System.out.println("Zero");
                originalDigitNumber--;
                continue;
            }
            break;
        }

    }



    public static int reverse(int numberx){
        int reversed = 0;

        while (true){
            if (numberx >= 10){
                reversed = reversed + (numberx % 10);
                numberx /= 10;
                reversed *= 10;
                continue;
            } else if (numberx <= -10){
                reversed = reversed + (numberx % 10);
                numberx /= 10;
                reversed *= 10;
                continue;
            }
            reversed = reversed + numberx;
            return reversed;
        }

    }
    public static void Printing (int numberToPrint){
        if (numberToPrint == 0){
            System.out.println("Zero");
        }else if (numberToPrint == 1){
            System.out.println("One");
        }else if (numberToPrint == 2){
            System.out.println("Two");
        }else if (numberToPrint == 3){
            System.out.println("Three");
        }else if (numberToPrint == 4){
            System.out.println("Four");
        }else if (numberToPrint == 5){
            System.out.println("Five");
        }else if (numberToPrint == 6){
            System.out.println("Six");
        }else if (numberToPrint == 7){
            System.out.println("Seven");
        }else if (numberToPrint == 8){
            System.out.println("Eight");
        }else if (numberToPrint == 9){
            System.out.println("Nine");
        }
    }


    public static int getDigitCount (int numbery){
        if (numbery < 0){
            return -1;
        }
        int digitNumber = 0;
        while(true){

            if (numbery >=10){
                numbery /= 10;
                digitNumber++;
                continue;
            }
            digitNumber++;
            break;
        }
        return digitNumber;
    }
}
