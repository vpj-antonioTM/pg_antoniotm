package ejercicio.pkg04;

import java.util.Scanner;

public class Ejercicio04 {

    /**
     * @author Antonio
     * Ejercicio-04
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Pimero añado la clase Scanner  y la variables para solicitar al usuario los 3 numeros y me imprima la solicitud
       Scanner dato1 = new Scanner (System.in);
       System.out.println("Por favor, introduzca el primer numero: ");
       int num1 = dato1.nextInt();
       
       Scanner dato2 = new Scanner (System.in);
       System.out.println("Ahora, introduzca un segundo numero: ");
       int num2 =dato2.nextInt();
       
       Scanner dato3 = new Scanner (System.in);
       System.out.println("Por favor, introduzca el tercer numero:: ");
       int num3 =dato3.nextInt();
       
       //Añado una variable "menor" para que su funcion sea darme el resultado de la comparacion de los numeros
       int menor;
       
       //Aqui hago una estructura condicional que realiza la comparativa de valor de los 3 numero y le pido que el que tenga menos valor me los guarde en la variable "menor"
       if (num1 <=  num2 && num1 <= num3){
           menor = num3;
       }
       else if  (num2 <= num1 && num2 <= num3){
           menor= num2;
       }
       else {
           menor = num3;
       }
       //Y aqui pido que imprima el resultado del numero menor
       System.out.println( "El numero menor de los introducidos es el " + menor);
    }
    
}
