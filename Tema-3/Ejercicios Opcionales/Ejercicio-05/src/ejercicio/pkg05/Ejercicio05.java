package ejercicio.pkg05;

import java.util.Scanner;

public class Ejercicio05 {

    /**
     * @author Antonio
     * Ejercicio-05
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Añado la clase Scanner para que le pida al usuario un numero
            Scanner dato1 = new Scanner (System.in);
            System.out.println("Por favor, introduzca un numero: ");
            int num1 = dato1.nextInt();
            
            //Esta estructura condicional va a coger el numero que ha introducido el usuario y lo va a dividir entre 2, dependiendo si el resultado es 0 o 1, imprimira si es par o impar
            if (num1 % 2 == 0 ){
           System.out.println( "Este numero es par =  " + num1);
            }
            else {
           System.out.println("Este numero es impar  = " + num1);
            }
    }
    
}
