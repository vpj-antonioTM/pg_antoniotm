package ejercicio.pkg13;

import java.util.Scanner;

public class Ejercicio13 {

    /**
     * @author Antonio
     * Ejercicio-13
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        // Pedir número hasta que sea mayor que 1
        do {
            System.out.print("Introduce un numero mayor que 1: ");
            numero = sc.nextInt();

            if (numero <= 1) {
                System.out.println("Error: El numero debe ser mayor que 1. Inténtalo de nuevo.");
            }
        } while (numero <= 1);

        // Mostrar números del 1 al número introducido
        System.out.println("Numeros del 1 al " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }
    }
    
}
