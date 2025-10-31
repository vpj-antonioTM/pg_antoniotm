package ejercicio.pkg10;

import java.util.Scanner;

public class Ejercicio10 {

    /**
     * @author Antonio
     * Ejercicio-10
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número para calcular su tabla de multiplicar: ");
        int numero = sc.nextInt();

        Operacion.tablaMultiplicar(numero);
    }
    
}
