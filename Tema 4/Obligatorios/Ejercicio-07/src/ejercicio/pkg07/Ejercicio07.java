package ejercicio.pkg07;

import java.util.Scanner;

public class Ejercicio07 {

    /**
     * @author Antonio
     * Ejercicio-07
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduzca un numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ahora, introduzca un segundo numero: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Por favor, introduzca un tercer numero: ");
        int num3 = scanner.nextInt();
        
        System.out.println("Por favor, introduzca un tercer numero: ");
        int num4 = scanner.nextInt();
        
        Orden.imprimirOrden(num1, num2, num3, num4);
        
        scanner.close();
    }
    
}
