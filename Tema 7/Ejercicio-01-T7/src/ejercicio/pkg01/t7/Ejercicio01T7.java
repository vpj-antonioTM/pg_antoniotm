package ejercicio.pkg01.t7;

import java.util.Scanner;

public class Ejercicio01T7 {

    public static void main(String[] args) {
        int[] vector = new int [10];
        rellenarVector(vector);
        parVector(vector);
        mostrarVector(vector);
    }
    
    public static void rellenarVector (int vector[]) {
        Scanner entrada = new Scanner (System.in);
        int i;
        System.out.println("Rellena los siguientes huecos de la array");
        for (i = 0; i < 10 ; i++){
            System.out.println("introduce un valor para la posicion " + i + " :");
            vector[i] = entrada.nextInt();
        }
    }
    
    public static void parVector (int vector[]) {
        int i;
        System.out.println("\nNumero Par o Impar");
        for(i = 0; i <10 ; i++) {
            if (vector[i]  % 2 == 0){
                System.out.println("El numero " + vector[i] +  " de la posicion " + i +  " es par");
            }
            else {
                System.out.println("El numero " + vector[i] +  " de la posicion " + i +   " es impar");
            }
        }
    }
    
    public static void mostrarVector (int vector[]) {
        int i;
        for (i = 0 ; i <10 ; i++) {
            System.out.println("\nEl valor guardado en la posicion " + i + " es de: " + vector[i]);
        }
    }
    
}
