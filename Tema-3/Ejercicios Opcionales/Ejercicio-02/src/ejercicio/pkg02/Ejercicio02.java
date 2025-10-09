package ejercicio.pkg02;

import java.util.Scanner;

public class Ejercicio02 {

    /**
     * @author Antonio
     * Ejercicio-02
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner dato1 = new Scanner (System.in);
       System.out.println("Por favor, introduzca un numero: ");
              int num1 = dato1.nextInt();
       
       Scanner dato2 = new Scanner (System.in);
       System.out.println("Ahora, introduzca un segundo numero: ");
       int num2 =dato2.nextInt();
       
       
       int producto = num1 * num2;
       int suma = num1 + num2;
       
       if (num1 >= 10 ){
           System.out.println( "La operación que se realizó es producto y el resultado es " + producto);
       }
       else {
           System.out.println("La operación que se realizó es suma y el resultado es " + suma );
       }
    }
    
}
