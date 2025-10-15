package ejercicio.pkg23;

import java.util.Scanner;

public class Ejercicio23 {

    /**
     * @author Antonio
     * Ejercicio-23
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un numero mayor que 1: ");
            numero = sc.nextInt();

            if (numero <= 1) {
                System.out.println("!ERROR¡ El numero que has introducido no es valido");
            }

        } while (numero <= 1);

        System.out.println("Numeros entre 1 y " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            System.out.print(i + " ");
        }
    }
}
