/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6.t12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EJ6T12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcion = 0;

        do {
            System.out.println("Menu del programa");
            System.out.println("1. 100 primeros numeros pares");
            System.out.println("2. Mostrar fichero");
            System.out.println("3. Salir del programa");
            System.out.println("Elige una opcion");

            try {
                opcion = entrada.nextInt();
                entrada.nextLine();

                switch (opcion) {
                    case 1 ->
                        numerosPares();
                    case 2 ->
                        mostrar();
                    case 3 ->
                        System.out.println("Saliendo del programa");
                    default ->
                        System.out.println("Opcion no valida");
                }

            } catch (InputMismatchException e) {
                // Captura si el usuario escribe letras en vez de números
                System.out.println("Error debes introducir un numero.");
                entrada.nextLine(); // Limpia el error del scanner
                opcion = 0; // Para que el menú continúe
            }
        } while (opcion != 3);
    }

    public static void numerosPares() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el nombre del fichero (ej: pares.txt): ");
        String nombre = entrada.nextLine();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombre))) {

            for (int i = 0; i < 100; i++) {
                bw.write((i * 2) + "");
                bw.newLine();
            }

            System.out.println("Fichero '" + nombre + "' creado correctamente.");

        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        }
    }

    public static void mostrar() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el nombre del fichero a leer: ");
        String nombre = entrada.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(nombre))) {

            String linea;
            System.out.println("\n--- Contenido del fichero '" + nombre + "' ---");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("No se pudo leer el fichero: " + e.getMessage());
        }
    }
}