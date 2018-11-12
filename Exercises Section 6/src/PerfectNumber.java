public class PerfectNumber {
    public static void main(String[] args) {

        System.out.println(isPerfectNumber(28));
    }

    public static boolean isPerfectNumber (int number){
        if (number < 1){
            return false;
        }
        int divisor = 1;
        int sum = 0;
        while (true){
            if (number % divisor == 0){
                sum += divisor;
                divisor++;
                if (sum == number){
                    return true;
                }
                continue;
            }
            divisor++;
            if (divisor > number){
                break;
            }

        }
        return false;
    }
}
