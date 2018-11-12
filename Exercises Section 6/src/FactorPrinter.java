public class FactorPrinter {


    public static void main(String[] args) {

        printFactors(6);
    }


    public static void printFactors (int number){
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        int numberx= 1;

        while (true){
            if (numberx > number){
                break;
            }
            if (number % numberx == 0){
                System.out.println(numberx);
                numberx++;
                continue;
            }

            numberx++;


        }
    }
}
