package p5;


/* ---------Project Euler --------- *
 * ---------- Problem05 ----------- *
 * -------------------------------- *
 * by Joás V. Pereira               *
 *    joasdavid@gmail.com           *
*/

public class prob05 {
    
    public static void main(String[] args) {
        int number = 0;
        int divs = 20;
        boolean sair = false;   
        while(!sair){
            number++;
            int cont = 0;
            for (int i = 1; i <= divs; i++) {
                if (number%i == 0) {
                    cont++;
                }
            }
            if(cont == divs) {
                sair = true;
            }
        }
        System.out.println("->"+number);
    }
}
