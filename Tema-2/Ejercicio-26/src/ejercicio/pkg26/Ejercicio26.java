package ejercicio.pkg26;

import static java.lang.System.out;
import java.util.Scanner;


public class Ejercicio26 {

    /**
     * @author Antonio
     * Ejercicio-26
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Aqui llamo a la Clase Scanner
        Scanner datos = new Scanner (System.in);
        
        //Aqui le pido al usuario que escriba el numero de 4 cifras
        System.out.println("Por favor, introduzca un numero de 4 cifras; ");
        int numero = datos.nextInt();
        
        //El primer numero lo divido entre 1000 para que me de la primera cifra 1234/1000 = 2
        int num1 = numero / 1000; 
        
        //Aqui divido entre 100 y pido el modulo para que me de el ultimo digito 1234/100 = 12 % 10 = 2
        int num2 = (numero / 100) % 10;
        
        //Aqui realizaria lo mismo que la operacion anterior pero en vez de centenas decenas 1234/10 = 123 % 10 = 3
        int num3 = (numero / 10) % 10; 
        
        //Aqui lo unico que hago es pedirle el ultimo digito 1234 % 10 = 4
        int num4 = numero % 10;

        //Aqui pido los digito de uno en uno
        System.out.println("La primera crifra es: " + num1);
        System.out.println("La primera crifra es: " + num2);
        System.out.println("La primera crifra es: " + num3);
        System.out.println("La primera crifra es: " + num4);
        
        
       /*
        Explicación detallada
        
        num1 1234/1000 = 1
        num2 1234/100 = 12 % 10 (12/10 = 10 resto 2)
        num3 1234/10 = 123 % 10 (123/10) = 12 resto 3 
        num4 1234 % 10 = 123 resto 4
        
        */
       
       
    }
    
}
