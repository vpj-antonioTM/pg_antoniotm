package ejercicio.pkg17;

import java.util.Scanner;

public class Ejercicio17 {

    /**
     * @author Antonio
     * Ejercicio-17
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Añado la clase Scanner para pedirle un dato al usuario
        Scanner sc = new Scanner(System.in);
        
        //Añado la variable double para que use decimales
        double numero;

        do {
            //Aqui le pido un numero al usuario
            System.out.print("Por favor, introduzca un numero: ");
            numero = sc.nextDouble();

            //Aqui le digo que si es un numero negativo imprima el mensaje de error y le pida otra vez el numero
            if (numero < 0) {
                System.out.println("!ERROR¡ Vuelve a introducir un numero que sea positivo.");
            }
        //Aqui le digo que si el numero es positivo cumple las condiciones    
        } while (numero < 0); 
        
        //Aqui creo la operacion para sacar la raiz del numero introducido
        double raiz = Math.sqrt(numero);
        System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);
    }
    
}
