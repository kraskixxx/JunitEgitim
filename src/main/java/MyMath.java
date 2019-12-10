/**
 * @author Samet BUDAK
 * @since
 */
public class MyMath {

    /**
     * Method to check is input integer is prime or not
     * @param number is integer
     * @return true if the input integer is prime, and false if not.
     */
    public static boolean isPrime(int number) {
        if(number >= 2) {
            if(number %2 == 0) {
                if( number == 2) {
                    return true;
                }
            } else {
                int max = (int) Math.sqrt(number);
                for (int i = 2; i<=max; i +=2) {
                    if(number %i == 0) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
