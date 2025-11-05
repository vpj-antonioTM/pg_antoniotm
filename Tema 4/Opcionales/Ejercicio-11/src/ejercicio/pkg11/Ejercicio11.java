package ejercicio.pkg11;

import java.util.Scanner;

public class Ejercicio11 {

    /**
     * @author Antonio
     * Ejercicio-11
     * @param args the command line arguments
     */
    public static int pedirNumero() {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Introduce un número (no negativo): ");
            n = sc.nextInt();

            if (n < 0) {
                System.out.println("Error: No se permiten números negativos. Inténtelo de nuevo.");
            }

        } while (n < 0);

        return n;
    }

    public static double calcularRaiz(int numero) {
        return Math.sqrt(numero);
    }

    public static void mostrarResultado(int numero, double raiz) {
        System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);
    }
    
}
