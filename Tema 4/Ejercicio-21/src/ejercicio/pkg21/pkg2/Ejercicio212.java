package ejercicio.pkg21.pkg2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio212 {
    public static void main(String[] args) {
        numeros();
    }

    public static void numeros() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un numero");
        int numero1 = sc.nextInt();
        int numero2;

        do {
            System.out.println("Introduzca un numero mayor que el primero");
            numero2 = sc.nextInt();

            if (numero2 <= numero1) {
                System.out.println("Error, vuelve a introducir el numero");
            }
        } while (numero2 <= numero1);

        sc.close();
        suma(numero1, numero2);
    }

    public static void suma(int numero1, int numero2) {
        int resultado = numero1 + numero2;
        System.out.println("El resultado es " + numero1 + " + " + numero2 + " = " + resultado);
    }
}