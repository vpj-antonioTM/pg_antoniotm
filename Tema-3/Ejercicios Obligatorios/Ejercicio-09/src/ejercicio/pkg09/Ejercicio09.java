package ejercicio.pkg09;

import java.util.Scanner;

public class Ejercicio09 {

    /**
     * @author Antonio
     * Ejercicio-09
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Utilizo la clase Scanner para pedirle al usuario que introduzca un valor
        Scanner dato1 = new Scanner (System.in);
        
        //Aqui pido los 4 numeros para que el usuario los introduzca
        System.out.println("Por favor, introduzca una cantidad de dinero: ");
        int num1 = dato1.nextInt();
        
        System.out.println("Ahora introduzca un segundo numero: ");
        int num2 = dato1.nextInt();
        
        System.out.println("Introduzca el tercer numero: ");
        int num3 = dato1.nextInt();
        
        System.out.println("Por ultimo, introduzca un cuarto numero: ");
        int num4 = dato1.nextInt();
        
        //Utilizo una Array para guardar los numeros
        int[] numeros = {num1, num2, num3, num4};
        
        //Metodo burbuja para ordenar los numeros de menor a mayor
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length -1 -i; j++) {
                
                //Comparacion numeros con la estructura condicional if else
                if (numeros[j] > numeros[j + 1]) {
                    //Intercambia y coloca los numeros
                    int aux = numeros [j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                    
                }
                    else {
                            
                }
            }
        }
        //Esta parte del codigo es para mostrar el resultado
        System.out.print("\nEl orden de los números introducidos es: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) {
                System.out.print(" - ");
            }
        }
    }
}

    

