/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg01;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo una clase Scanner para que le pida al usuario que introduzca un numero
       Scanner dato = new Scanner (System.in);
       
       //Creo el mensaje que le salta al usuario y tambien añado una variable para numero
       System.out.println("Por favor, introduzca un numero: ");
       int numero = dato.nextInt();
       
       //Creo un if y le digo que aquel numero que sea mayor o igual que 0 imprima el mensaje positivo
       if (numero >= 0 ){
           System.out.println( "El numero introducido es positivo");
       }
       //Y hago un else para que todos los numeros que no cumplan lo que pide if, le imprima negativo
       else {
           System.out.println("El numero introducido es negativo");
       }
    }
    
}
