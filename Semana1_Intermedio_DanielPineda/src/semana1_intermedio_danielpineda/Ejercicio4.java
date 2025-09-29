
package semana1_intermedio_danielpineda;
import java.util.Scanner;
/**
 *
 * @author Dante
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos términos de Fibonacci deseas mostrar? ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("El valor de n debe ser mayor que 0.");
            sc.close();
            return;
        }

        long a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + (i < n ? ", " : "\n"));
            long next = a + b;
            a = b;
            b = next;
        }
        sc.close();
    }
}
