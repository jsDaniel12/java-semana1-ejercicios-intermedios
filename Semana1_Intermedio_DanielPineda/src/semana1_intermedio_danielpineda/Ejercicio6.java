/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1_intermedio_danielpineda;
import java.util.Scanner;
/**
 *
 * @author Dante
 */
public class Ejercicio6 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos estudiantes (N)?: ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("N debe ser mayor que 0.");
            sc.close();
            return;
        }

        double suma = 0;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;

        for (int i = 1; i <= N; i++) {
            System.out.print("Nota del estudiante " + i + ": ");
            double nota = sc.nextDouble();
            suma += nota;
            if (nota > max) max = nota;
            if (nota < min) min = nota;
        }

        double promedio = suma / N;
        System.out.println("Promedio general: " + promedio);
        System.out.println("Nota más alta: " + max);
        System.out.println("Nota más baja: " + min);
        sc.close();
    }
}
