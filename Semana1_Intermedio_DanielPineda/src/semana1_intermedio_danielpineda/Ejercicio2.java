package semana1_intermedio_danielpineda;
import java.util.Scanner;
/**
 *
 * @author Dante
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;
        
        do {
            System.out.println("\n===== CALCULADORA AVANZADA =====");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia (x^y)");
            System.out.println("6. Raíz cuadrada");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1: // SUMA
                    System.out.print("Ingresa el primer número: ");
                    num1 = sc.nextDouble();
                    System.out.print("Ingresa el segundo número: ");
                    num2 = sc.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                    
                case 2: // RESTA
                    System.out.print("Ingresa el primer número: ");
                    num1 = sc.nextDouble();
                    System.out.print("Ingresa el segundo número: ");
                    num2 = sc.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                    
                case 3: // MULTIPLICACIÓN
                    System.out.print("Ingresa el primer número: ");
                    num1 = sc.nextDouble();
                    System.out.print("Ingresa el segundo número: ");
                    num2 = sc.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                    
                case 4: // DIVISIÓN
                    System.out.print("Ingresa el dividendo: ");
                    num1 = sc.nextDouble();
                    System.out.print("Ingresa el divisor: ");
                    num2 = sc.nextDouble();
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir entre 0.");
                    }
                    break;
                    
                case 5: // POTENCIA
                    System.out.print("Ingresa la base: ");
                    num1 = sc.nextDouble();
                    System.out.print("Ingresa el exponente: ");
                    num2 = sc.nextDouble();
                    resultado = Math.pow(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                    
                case 6: // RAÍZ CUADRADA
                    System.out.print("Ingresa el número: ");
                    num1 = sc.nextDouble();
                    if (num1 >= 0) {
                        resultado = Math.sqrt(num1);
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Error: No se puede calcular raíz cuadrada de un número negativo.");
                    }
                    break;
                    
                case 7: // SALIR
                    System.out.println("Saliendo de la calculadora... ¡Hasta luego!");
                    break;
                    
                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }
        } while (opcion != 7);
        
        sc.close();
    }
}
