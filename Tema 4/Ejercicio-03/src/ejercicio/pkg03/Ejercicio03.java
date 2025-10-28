package ejercicio.pkg03;

import java.util.Scanner;

public class Ejercicio03 {

    /**
     * @author Antonio
     * Ejercicio-03
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
        
        Comprobador.imprimirMayor(num1, num2, num3);
        
        scanner.close();
    }
}
   
