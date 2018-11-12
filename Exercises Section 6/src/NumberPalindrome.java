public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
    }
    public static boolean isPalindrome (int number){
        int num = 0;
        int number2 = number;
        while (true){

            if (number2 >= 10){
                num = num * 10;
              num = num + (number2 % 10);
              number2 /= 10;

              continue;
            }else if (number2 <= -10){
                num = num * 10;
                num = num + (number2 % 10);
                number2 /= 10;

                continue;
            }

            num = num * 10;
            num = num + number2;

            break;
        }
         if (number == num){
             return true;
         }
         else{
             return false;
         }
    }
}
