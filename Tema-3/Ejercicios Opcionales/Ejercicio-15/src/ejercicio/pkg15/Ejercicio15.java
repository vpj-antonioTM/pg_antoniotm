package ejercicio.pkg15;

import java.util.Scanner;

public class Ejercicio15 {

    /**
     * @author Antonio
     * Ejercicio-15
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero para calcular su tabla de multiplicar: ");
        int numero = sc.nextInt();
        
        /*Aqui creo un bucle for, lo primero que le pido esque empiece con el numero 1, 
          que repita la multiplicacion 10 veces, y que cada vez que de una vuelta al uno 
          le sume 1 hasta las 10 vueltas*/
            for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

    }
    
}
