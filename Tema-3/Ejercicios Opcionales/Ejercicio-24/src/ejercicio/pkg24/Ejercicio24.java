package ejercicio.pkg24;

import java.util.Scanner;

public class Ejercicio24 {

    /**
     * @author Antonio
     * Ejercicio-24
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        // Pedir un número mayor que 0
        do {
            System.out.print("Introduce un numero mayor que 0: ");
            numero = sc.nextInt();

            if (numero <= 0) {
                System.out.println("!ERROR¡ El numero debe ser mayor que 0.");
            }

        } while (numero <= 0);

        // Imprimir los múltiplos de 3 entre 1 y el número
        int contador = 0;
        System.out.println("Multiplos de 3 entre 1 y " + numero + ":");

        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                contador++;
            }
        }

        // Mostrar la cantidad de múltiplos encontrados
        System.out.println("\n  Total de múltiplos de 3: " + contador);
    }
}
