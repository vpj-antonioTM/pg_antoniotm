package ejercicio.pkg08;

import java.util.Scanner;

public class Ejercicio08 {

    /**
     * @author Antonio
     * Ejercicio-08
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, indique una cantidad de dinero: ");
        int euros = scanner.nextInt();

        Dinero.dividirDinero(euros);

        scanner.close();
    }
    
}
