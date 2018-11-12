public class FlourPacker {
    public static void main(String[] args) {

        System.out.println(canPack(0,5,4));
    }

    public static boolean canPack (int bigCount, int smallCoun, int goal){
        if (bigCount < 0 || smallCoun <0 || goal < 0){
            return false;
        }

        int j = 0;
        int sum =0;
        int bignumber = bigCount * 5;

        for (int i = 0; i <= smallCoun; i ++){

            System.out.println(" i is now " + i);

            j = 0;
            sum = j +i;
            if (sum == goal){
                return true;
            }
            while (true){

                sum = j + i;

                if (sum == goal){
                    return true;
                }

                j +=5;
                System.out.println(" j is now " + j);
                if (j > bignumber ){
                    break;
                }
            }

        }
      return false;
    }
}
