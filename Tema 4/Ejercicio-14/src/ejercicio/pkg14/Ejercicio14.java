package ejercicio.pkg14;

import java.util.Scanner;

public class Ejercicio14 {

    /**
     * @author Antonio
     * Ejercicio-14
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        // Pedir número mayor que 0
        do {
            System.out.print("Introduce un numero mayor que 0: ");
            numero = sc.nextInt();

            if (numero <= 0) {
                System.out.println("Error: El numero debe ser mayor que 0. Intentalo de nuevo.");
            }
        } while (numero <= 0);

        // Mostrar múltiplos de 3 y contar
        int contador = 0;
        System.out.println("Multiplos de 3 entre 1 y " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                contador++;
            }
        }

        System.out.println("Total de multiplos de 3: " + contador);
    }
    
}
