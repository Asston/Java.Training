public class EvenDigitSum {
    public static int getEvenDigitSum (int number){
        if (number <0){
            return -1;
        }
        int sum = 0;
        while (true){

            if (number >=10){
                int digit = number % 10;

                if (digit % 2 == 0){
                    sum = sum + digit;
                }
                number /= 10;
                continue;
            }
            if (number % 2 ==0) {
                sum += number;
                break;
            }
            break;
        }
        return sum;
    }
}
