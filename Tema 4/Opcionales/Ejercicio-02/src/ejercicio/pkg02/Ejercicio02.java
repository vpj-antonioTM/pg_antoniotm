package ejercicio.pkg02;

import java.util.Scanner;

public class Ejercicio02 {

    /**
     * @author Antonio
     * Ejercicio-02
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduzca un numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ahora, introduzca un segundo numero: ");
        int num2 = scanner.nextInt();

        // Crear objeto de la clase Operaciones
        Operaciones op = new Operaciones();

        // Verificar la condición
        if (num1 > 10) {
            int producto = op.multiplicar(num1, num2);
            System.out.println("La operacion que se realizo es el producto y el resultado es " + producto);
        } else {
            int suma = op.sumar(num1, num2);
            System.out.println("La operacion que se realizo es la suma y el resultado es " + suma);
        }

        scanner.close();
    }
}
