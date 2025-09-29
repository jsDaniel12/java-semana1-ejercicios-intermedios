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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 1000.0; // saldo inicial
        int opcion;
        
        do {
            System.out.println("\n===== CAJERO AUTOMÁTICO =====");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Tu saldo actual es: $" + saldo);
                    break;
                case 2:
                    System.out.print("Ingresa la cantidad a depositar: $");
                    double deposito = sc.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("Depósito exitoso. Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("Cantidad inválida.");
                    }
                    break;
                case 3:
                    System.out.print("Ingresa la cantidad a retirar: $");
                    double retiro = sc.nextDouble();
                    if (retiro > 0 && retiro <= saldo) {
                        saldo -= retiro;
                        System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("Fondos insuficientes o cantidad inválida.");
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
            
        } while (opcion != 4);
        
        sc.close();
    
    }
    
}
