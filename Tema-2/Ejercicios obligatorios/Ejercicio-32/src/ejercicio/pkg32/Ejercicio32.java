package ejercicio.pkg32;

import java.util.Scanner;


public class Ejercicio32 {

    /**
     * @author Antonio
     * Ejercicio-32
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Aqui llamo a la Clase Scanner
        Scanner datos = new Scanner (System.in);
        
        //Aqui le pido al usuario que escriba el dinero
        System.out.println("Por favor, introduzca una cantidad de dinero; ");
        int dinero = datos.nextInt();
        int total = dinero;
        
        int billetes50 = dinero / 50;
        dinero = dinero % 50;
        
        int billetes20 = dinero / 20;
        dinero = dinero % 20;
        
        int billetes10 = dinero / 10;
        dinero = dinero % 10;
        
        int billetes5 = dinero / 5;
        dinero = dinero % 5;
        
        int monedas2 = dinero / 2;
        dinero = dinero % 2;
        
        int monedas1 = dinero / 1;
        dinero = dinero % 1;
        
        System.out.println(total + " Euros se descomponen en " 
                + billetes50 + " billetes de 50, " 
                + billetes20 + " billetes de 20, " 
                + billetes10 + " billetes de 10, " 
                + billetes5 + " billetes de 5, " 
                + monedas2 + " monedas de 2 euros y " 
                + monedas1 + " monedas de 1 euro");
    }
    
}
