public class GreatestCommonDivisor {

        public static void main(String[] args) {

            System.out.println(getGreatestCommonDivisor(12, 30));
        }

    public static int getGreatestCommonDivisor ( int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }
        int smaler = 0;
        int bigger = 0;

        if (first > second){
            bigger = first;
            smaler = second;

        }else {
            bigger = second;
            smaler = first;
        }
        System.out.println(bigger);
        System.out.println(smaler);

        for (int i = smaler; i > 1; i--){
            System.out.println(i);

            if (smaler % i == 0) {
                if (bigger % i == 0) {
                    System.out.println(i);

                    return i;
                }

            }
        }
        return -1;
    }
}
