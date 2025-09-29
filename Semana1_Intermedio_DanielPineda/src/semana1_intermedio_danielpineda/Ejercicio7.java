/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1_intermedio_danielpineda;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Dante
 */
public class Ejercicio7 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int secreto = rnd.nextInt(100) + 1; // 1..100
        int intentos = 0;
        int x;

        System.out.println("He pensado un número entre 1 y 100. ¡Adivínalo!");

        while (true) {
            System.out.print("Tu intento: ");
            x = sc.nextInt();
            intentos++;

            if (x == secreto) {
                System.out.println("¡Felicidades! Lo lograste en " + intentos + " intentos.");
                break;
            } else if (x > secreto) {
                System.out.println("Demasiado alto");
            } else {
                System.out.println("Demasiado bajo");
            }
        }
        sc.close();
    }
}
