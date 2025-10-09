package ejercicio.pkg06;

import java.util.Scanner;

public class Ejercicio06 {

    /**
     * @author Antonio
     * Ejercicio-06
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //Añado la clase Scanner para que le pida al usuario un numero entre el 0 y el 10
            Scanner dato1 = new Scanner (System.in);
            System.out.println("Por favor, introduzca una nota del 0 al 10: ");
            int num1 = dato1.nextInt();
            
            //Aqui creo una estructura condicional, que lo que va a realizar imprimir un mensaje dependiendo del valor del numero
            if (num1 >=  0  && num1 <= 4){
           System.out.println("La nota es de " + num1 + " es Suspenso");
       }
            else if  (num1 >= 5 && num1 <= 6){
           System.out.println("La nota es de " + num1 + " es Bien");
       }
            else if(num1 >= 7 && num1 <= 8){
           System.out.println("La nota es de " + num1 + " es Notable");
       }
            else if(num1 >= 9 && num1 <= 10){
           System.out.println("La nota es de " + num1 + " es Sobresaliente");
       }
            else {
           System.out.println(num1 + " Error, este numero no es correcto");
       }
            //El ultimo else de la estructura anterior realiza que todo numero que se salga de entre 0 y 10 le imprima un mensaje de error en pantalla al usuario
    }
    
}
