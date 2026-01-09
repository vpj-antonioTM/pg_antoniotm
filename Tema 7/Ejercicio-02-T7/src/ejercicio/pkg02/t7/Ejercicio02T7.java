/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg02.t7;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio02T7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[7];
        rellenarVector(vector);
        intercambiarVector(vector);
        mostrarVector(vector);
    }

    public static void rellenarVector(int vector[]) {
        Scanner entrada = new Scanner(System.in);
        int i;
        System.out.println("Rellena los siguientes huecos de la array");
        for (i = 0; i < 7; i++) {
            System.out.println("introduce un valor para la posicion " + i + " :");
            vector[i] = entrada.nextInt();
        }
    }

    public static void intercambiarVector(int vector[]) {
        int aux = vector[1];
        vector[1] = vector[3];
        vector[3] = aux;
    }

    public static void mostrarVector(int vector[]) {
        int i;
        for (i = 0; i < 7; i++) {
            System.out.println("\nEl valor guardado en la posicion " + i + " es de: " + vector[i]);
        }
    }
}
