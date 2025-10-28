package ejercicio.pkg06;

import java.util.Scanner;

public class Ejercicio06 {

    /**
     * @author Antonio
     * Ejercicio-06
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduzca un numero: ");
        int nota = scanner.nextInt();
        
        Nota.imprimirNota(nota);
        
        scanner.close();
    }
    
}
