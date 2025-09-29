/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1_intermedio_danielpineda;
import java.util.Scanner;
import java.math.BigInteger;
/**
 *
 * @author Dante
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un entero n (n >= 0): ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("n debe ser >= 0.");
            sc.close();
            return;
        }

        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(n + "! = " + fact);
        sc.close();
    }
}
