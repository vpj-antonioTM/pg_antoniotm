/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg12.t8;

/**
 *
 * @author alumno
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Vector de 4 muebles
        Mueble[] muebles = new Mueble[4];

        int opcion;

        do {
            System.out.println("\n--- MENÚ MUEBLES ---");
            System.out.println("1. Mostrar muebles");
            System.out.println("2. Rellenar muebles");
            System.out.println("3. Mostrar muebles por precio");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:
                    System.out.println("\n--- LISTA DE MUEBLES ---");
                    for (int i = 0; i < muebles.length; i++) {
                        if (muebles[i] != null) {
                            System.out.println("Mueble " + (i + 1) + ":");
                            muebles[i].mostrarInfo();
                        } else {
                            System.out.println("Mueble " + (i + 1) + ": vacío");
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n--- RELLENAR MUEBLES ---");
                    for (int i = 0; i < muebles.length; i++) {
                        System.out.println("Introduce descripción del mueble " + (i + 1) + ":");
                        String desc = entrada.nextLine();

                        System.out.println("Introduce precio del mueble " + (i + 1) + ":");
                        double precio = entrada.nextDouble();
                        entrada.nextLine(); // limpiar buffer

                        muebles[i] = new Mueble(precio, desc);
                    }
                    break;

                case 3:
                    System.out.println("\nIntroduce un precio máximo:");
                    double precioMax = entrada.nextDouble();

                    System.out.println("\n--- MUEBLES CON PRECIO <= " + precioMax + " ---");
                    for (Mueble m : muebles) {
                        if (m != null && m.getPrecio() <= precioMax) {
                            m.mostrarInfo();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 4);

        entrada.close();
    }
}
