public class SharedDigit {


    public static boolean hasSharedDigit (int numberx, int numbery){

        if (numberx < 10 || numberx >99 || numbery < 10 || numbery > 99){
            return false;
        }
        int digitx1 = 0;
        int digitx2 = 0;
        int digity1 = 0;
        int digity2 = 0;
        digitx2 = numberx % 10;
        digity2 = numbery % 10;
        while (true){

            if (numberx >= 10){
                numberx = numberx / 10;
                digitx1 = numberx;
                continue;
            }
            else if (numbery >= 10){
                numbery = numbery / 10;
                digity1 = numbery;
                continue;
            }
            break;
        }
        if ((digitx1 == digity1) || (digitx1 == digity2) || (digitx2 == digity1 || (digitx2 == digity2))){
            return true;
        }
        else{
            return false;
        }
    }
}
