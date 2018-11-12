public class LastDigitChecker {

    public static boolean hasSameLastDigit ( int numberx, int numbery, int numberz){

        if (numberx <10 || numberx > 1000 ||numbery <10 || numbery > 1000 || numberz <10 || numberz > 1000){
            return false;
        }

        int digitnumberX = numberx % 10;
        int digitnumberY = numbery % 10;
        int digitnumberZ = numberz % 10;

        return (digitnumberX == digitnumberY || digitnumberX == digitnumberZ || digitnumberY == digitnumberZ);




    }
}
