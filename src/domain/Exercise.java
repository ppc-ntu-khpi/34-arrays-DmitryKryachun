package domain;
/**
 * class in which the calculations take place
 * @author dimon
 */
public class Exercise {
    /**
     * Method which checks if this number is an armstrong
     * @param number number to check
     * @return bollean value
     */
    public static boolean Armstrong(int number){
        
        int num = number, digit, sum = 0;
        /**
         * there is a calculation a^3+b^3+c^3
         */
        while (num != 0){
            digit = num % 10;
            sum = (int) (sum + Math.pow(digit,3));
            num /= 10;
        }
       
        return sum == number;

    }
}

