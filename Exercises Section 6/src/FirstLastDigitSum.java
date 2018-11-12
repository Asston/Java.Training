public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit (int number){
        if (number <0 ){
            return -1;
        }
        int firstDigit = 0;
        int lastDigit = 0;
        lastDigit = number % 10;

        while (number >= 0){
            if (number >= 10){
                number /= 10;
                continue;
            }
            firstDigit = number;
            break;
        }
        int sum = firstDigit + lastDigit;
        return sum;
    }
}
