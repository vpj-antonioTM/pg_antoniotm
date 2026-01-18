/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg09.t7;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio09T7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = pedirNumero();
        int cifras = calculoCifras(numero);
        int[] vectorCifras = dividirCifras(numero, cifras);

        System.out.println("El numero introducido escrito al reves es: ");
        mostrarAlReves(vectorCifras);
    }

    public static int pedirNumero() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        return entrada.nextInt();
    }

    public static int calculoCifras(int num) {
        num = Math.abs(num);
        int contador = 0;

        if (num == 0) {
            return 1;
        }

        while (num > 0) {
            num /= 10;
            contador++;
        }
        return contador;
    }

    public static int[] dividirCifras(int num, int cifras) {
        num = Math.abs(num);
        int[] vector = new int[cifras];

        for (int i = cifras - 1; i >= 0; i--) {
            vector[i] = num % 10;
            num /= 10;
        }
        return vector;
    }

    public static void mostrarAlReves(int[] vector) {
        for (int i = vector.length - 1; i >= 0; i--) {
            System.out.println(vector[i]);
        }
        System.out.println();
    }

}
