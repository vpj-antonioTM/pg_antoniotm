package ejercicio.pkg25;

import java.util.Scanner;

public class Ejercicio25 {

    /**
     * @author Antonio
     * Ejercicio-25
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Aqui llamo a la Clase Scanner
        Scanner datos = new Scanner (System.in);
        
        // Numero1
        System.out.println("Por favor, introduzca el primer número; ");
        int num1 = datos.nextInt();
        
        // Numero2
        System.out.println("Por favor, introduzca el segundo número; ");
        int num2 = datos.nextInt();
        
        // Numero3
        System.out.println("Por favor, introduzca el tercer número; ");
        int num3 = datos.nextInt();
        
        // Suma
        int suma = num1 + num2 + num3;
        System.out.println("La suma de los números introducidos es: " + suma);
        
        // Producto
        int producto = num1 * num2 * num3;
        System.out.println("El producto de los números introducido es: " + producto);
    }
    
}
