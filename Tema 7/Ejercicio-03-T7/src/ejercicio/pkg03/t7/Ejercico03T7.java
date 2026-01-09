/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg03.t7;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercico03T7 {

    public static void main(String[] args) {
        int longitud = pedirLongitud();
        int[] vector = new int[longitud];
       
        rellenarVector(vector);
        mostrarVector(vector);
    }
   
    public static int pedirLongitud() {
        Scanner entrada = new Scanner(System.in);
        int longitud = 0;
        boolean valido = false;
       
        while (!valido) {
            try {
                System.out.print("Introduce la longitud del array (1-10): ");
                longitud = entrada.nextInt();

                if (longitud >= 1 && longitud <= 10) {
                    valido = true;
                } else {
                    System.out.println("Error el numero debe ser entre 1 y 10.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error debes introducir un numero entero.");
                entrada.nextLine();
            }
        }
        return longitud;
    }

    public static void rellenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random() * 6) + 1;
        }
    }

    public static void mostrarVector(int[] vector) {
        System.out.println("Contenido del vector:");
        for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
