package ejercicio.pkg05;

import java.util.Scanner;

public class Ejercicio05 {

    /**
     * @author Antonio
     * Ejercicio-05
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduzca un numero: ");
        int num1 = scanner.nextInt();
        
        parImpar.imprimirParImpar(num1);
        
        scanner.close();
    }
    
}
