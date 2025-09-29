/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana1_intermedio_danielpineda;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Dante
 */
public class Ejercicio8 {
  static class Producto {
        String nombre;
        double precio;
        int cantidad;

        Producto(String nombre, double precio, int cantidad) {
            this.nombre = nombre;
            this.precio = precio;
            this.cantidad = cantidad;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> inventario = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n===== INVENTARIO =====");
            System.out.println("1. Registrar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Valor total del inventario");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1: // Registrar
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    System.out.print("Cantidad: ");
                    int cantidad = sc.nextInt();

                    boolean nombreValido = nombre != null && !nombre.trim().isEmpty(); // <-- aquí el cambio
                    if (precio >= 0 && cantidad >= 0 && nombreValido) {
                        inventario.add(new Producto(nombre.trim(), precio, cantidad));
                        System.out.println("Producto registrado.");
                    } else {
                        System.out.println("Datos inválidos.");
                    }
                    break;

                case 2: // Mostrar
                    if (inventario.isEmpty()) {
                        System.out.println("No hay productos registrados.");
                    } else {
                        System.out.println("\n--- Productos ---");
                        for (int i = 0; i < inventario.size(); i++) {
                            Producto p = inventario.get(i);
                            System.out.printf("%d) %s | Precio: %.2f | Cantidad: %d%n",
                                    i + 1, p.nombre, p.precio, p.cantidad);
                        }
                    }
                    break;

                case 3: // Valor total
                    double total = 0;
                    for (Producto p : inventario) {
                        total += p.precio * p.cantidad;
                    }
                    System.out.printf("Valor total del inventario: %.2f%n", total);
                    break;

                case 4:
                    System.out.println("Saliendo... ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}
