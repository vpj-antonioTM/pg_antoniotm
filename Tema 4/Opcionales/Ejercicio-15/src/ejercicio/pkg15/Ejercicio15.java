package ejercicio.pkg15;

import java.util.Scanner;

public class Ejercicio15 {

    /**
     * @author Antonio
     * Ejercicio-15
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Pedir los dos numeros
        System.out.print("Introduce el primer numero: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduce el segundo numero: ");
        double num2 = sc.nextDouble();

        int opcion;

        do {
            // Mostrar menu
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                case 2 -> System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                case 3 -> System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                case 4 -> {
                    try {
                        if (num2 == 0) {
                            throw new ArithmeticException("Error: No se puede dividir entre 0.");
                        }
                        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }   }
                case 5 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida, intentalo de nuevo.");
            }

        } while (opcion != 5);
    }
    
}
