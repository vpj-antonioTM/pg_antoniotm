/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5.t12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EJ5T12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n--- MENU DEL PROGRAMA ---");
            System.out.println("1. Anadir un contacto al fichero agenda.txt");
            System.out.println("2. Mostrar el contenido del fichero");
            System.out.println("3. Salir del programa");
            System.out.print("Elige una opcion: ");

            try {
                opcion = entrada.nextInt();
                entrada.nextLine(); // Limpia buffer

                switch (opcion) {
                    case 1 -> anadirContacto();
                    case 2 -> mostrarFichero();
                    case 3 -> System.out.println("Saliendo del programa...");
                    default -> System.out.println("Opcion no valida");
                }

            } catch (Exception e) {
                System.out.println("Error: Debes introducir un numero.");
                entrada.nextLine(); // Limpia error
            }

        } while (opcion != 3);
    }

    // 1º Metodo
    public static void anadirContacto() {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Introduce un nombre: ");
            String nombre = entrada.nextLine();

            System.out.print("Introduce una edad: ");
            int edad = entrada.nextInt();
            entrada.nextLine();

            System.out.print("Introduce un numero de telefono: ");
            String telefono = entrada.nextLine();

            // Abrimos el fichero en modo append
            FileWriter fw = new FileWriter("agenda.txt", true);

            // Escribimos el contacto en una linea
            fw.write(nombre + " - " + edad + " - " + telefono + "\n");

            fw.close();

            System.out.println("Contacto anadido correctamente.");

        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero.");
        } catch (Exception e) {
            System.out.println("Error inesperado al anadir el contacto.");
        }
    }

    // 2º Metodo
    public static void mostrarFichero() {
        File fichero = new File("agenda.txt");

        if (!fichero.exists()) {
            System.out.println("El fichero agenda.txt no existe todavia.");
            return;
        }

        try {
            Scanner lector = new Scanner(fichero);

            System.out.println("\n--- CONTENIDO DEL FICHERO ---");

            while (lector.hasNextLine()) {
                System.out.println(lector.nextLine());
            }

            lector.close();

        } catch (Exception e) {
            System.out.println("Error al leer el fichero.");
        }
    }
}