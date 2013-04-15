package p6;


/* ---------Project Euler --------- *
 * ---------- Problem06 ----------- *
 * -------------------------------- *
 * by Joás V. Pereira               *
 *    joasdavid@gmail.com           *
*/

public class prob06 {

    private static double sumOfSqueres(int num){
        double result = 0;
        for (int i = 1; i <= num; i++) {
            result += Math.pow(i, 2);
        }
        return result;
    }
    
    private static double squeresOfSum(int num){
        double result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        return Math.pow(result, 2);
    }
    
    
    public static void main(String[] args) {
        double num1 = sumOfSqueres(100);
        double num2 = squeresOfSum(100);
        
        double result = num2 - num1;
        System.out.println("-> "+(int)result);
    }
}
