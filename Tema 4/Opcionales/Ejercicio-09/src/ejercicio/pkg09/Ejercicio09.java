package ejercicio.pkg09;

import java.util.Scanner;

public class Ejercicio09 {

    /**
     * @author Antonio
     * Ejercicio-09
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int n1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int n2 = sc.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        int n3 = sc.nextInt();

        // Llamamos al método de la otra clase
        Operacion.numeroMenor(n1, n2, n3);
    }
    
}
