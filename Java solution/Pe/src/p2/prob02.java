/* ---------Project Euler --------- *
 * ---------- Problem02 ----------- *
 * -------------------------------- *
 * by Joás V. Pereira               *
 *    joasdavid@gmail.com           *
*/

package p2;

/**
 *
 * @author Joás V. Pereira <joasdavid@gmail.com>
 */
public class prob02 {

    public static void main(String[] args) {
        double phi = 1.61803;
        int n_number = 0;
        int max = 4000000;

        int sum = 0;
        int fib_n = 0;
        while (max >= fib_n) {
            if (fib_n % 2 == 0) {
                sum += fib_n;
            }
            fib_n = (int) ((Math.pow(phi, n_number) - Math.pow(phi, n_number * -1)) / Math.sqrt(5)) + 1;
            n_number++;
        }
        System.out.println("-->" + sum);
    }
}
