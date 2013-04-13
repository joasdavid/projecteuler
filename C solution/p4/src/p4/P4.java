/* ---------Project Euler --------- *
 * ---------- Problem04 ----------- *
 * -------------------------------- *
 * by Joás V. Pereira               *
 *    joasdavid@gmail.com           *
*/

public class P4 {
    
    public static boolean palindromic(int value){
        String _p = Integer.toString(value);
        int size = _p.length()-1;
        for (int i = 0; i <= size; i++) {
            if (_p.charAt(i) != _p.charAt(size-i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int max = 999;
        int min = 100;
        int result = 0;
        int theOne = 0;
        String text="nenhum encontrado!";
        for (int i = max; i >= min; i--) {
            for (int j = max; j >= min; j--) {
                result = i*j;
                if(palindromic(result)){
                    if(theOne<result){
                        theOne = result;
                        text = i+"*"+j+"="+theOne;
                    }
                }
            }
        }
        System.out.println(text);
    }
}
