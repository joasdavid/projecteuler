package p4;

/* ---------Project Euler --------- *
 * ---------- Problem04 ----------- *
 * -------------------------------- *
 * by Joás V. Pereira               *
 *    joasdavid@gmail.com           *
*/

public class Pe {
    
    public static boolean palindromic(int num){
        String _p = Integer.toString(num);
        int size = _p.length()-1;
        for (int i = 0; i <= size; i++) {
            if(_p.charAt(i) != _p.charAt(size-i)){
                return false;
            }                
        }
        return true;
    }

    public static void main(String[] args) {
        int max = 999;
        int min = 100;
        int result = 0;
        int largest = 0;
              
        for (int i = max; i >= min; i--) {
            for (int j = max; j >= min; j--) {
                result = i*j;
                if (palindromic(result)) {
                    largest = (largest<result)?result:largest;
                    break;
                }
            }
        }
        System.out.println("-->" + largest);
    }
}
