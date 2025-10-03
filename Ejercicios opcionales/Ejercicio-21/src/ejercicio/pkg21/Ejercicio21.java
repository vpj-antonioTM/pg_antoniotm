package ejercicio.pkg21;

import java.util.Scanner;

public class Ejercicio21 {

    /**
     * @author Antonio
     * Ejercicio-21
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Pido al ususario que introduzca unos segundos
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduzca un número de segundos: ");
        int totalSegundos = entrada.nextInt();
        
        // Aqui creo las varaibles que encesito
        int dias = totalSegundos / 86400;              
        int horas = (totalSegundos % 86400) / 3600;    
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;
        
        //Aqui hago para que se muestre el resultado
        System.out.println(
                totalSegundos + " segundos hacen un total de: " 
                + dias + " dias, " 
                + horas + " horas, " 
                + minutos + " minutos y " 
                + segundos + " segundos.");
        
    }
    
}
