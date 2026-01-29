/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg02.t8;

import java.util.InputMismatchException; 
import java.util.Scanner;

public class Ejercicio02T8 {

    // Metodo que pide al usuario la longitud del array entre 1 y 10
    public static int pedirLongitud() {
        Scanner entrada = new Scanner(System.in);
        int longitud = 0;
        boolean valido = false;

        while (!valido) {  //Se repite hasta que se introduzca un valor valido
            try {
                System.out.print("Introduce la longitud del array (1-10): ");
                longitud = entrada.nextInt();  //Pedimos la longitud

                // Comprobamos que esté en el rango correcto
                if (longitud >= 1 && longitud <= 10) {
                    valido = true;  //Si es correcto salimos
                } else {
                    System.out.println("El número debe estar entre 1 y 10.");
                }

            } catch (InputMismatchException e) {
                //Si se introduce un valor no valido entrar aqui
                System.out.println("Error: debes introducir un número entero.");
                entrada.nextLine();  // Limpiar el buffer
            }
        }

        return longitud;  //Devolvenos la longitud
    }

    // Metodo que rellena el array con numeros aleatorios entre 1 y 6
    public static void rellenarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 6) + 1;
        }
    }

    // Metodo que muestra el array usando for-each
    public static void mostrarArray(int[] array) {
        System.out.print("Contenido del array: ");
        for (int num : array) {
            System.out.print(num + " ");  //Vamos mostrando cada numero
        }
        System.out.println();
    }

    public static void main(String[] args) {

        //Pedimos la longitud del array
        int longitud = pedirLongitud();

        //Creamos el array con esa longitud
        int[] numeros = new int[longitud];

        //Lo rellenamos con valores aleatorios
        rellenarArray(numeros);

        //Lo muestra
        mostrarArray(numeros);
    }
}