
package semana1_intermedio_danielpineda;
import java.util.Scanner;
/**
 *
 * @author Dante
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        long n = sc.nextLong();

        if (n <= 1) {
            System.out.println(n + " NO es primo.");
        } else if (esPrimo(n)) {
            System.out.println(n + " SÍ es primo.");
        } else {
            System.out.println(n + " NO es primo.");
        }
        sc.close();
    }

    private static boolean esPrimo(long n) {
        if (n % 2 == 0) return n == 2;
        long lim = (long)Math.sqrt(n);
        for (long i = 3; i <= lim; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
