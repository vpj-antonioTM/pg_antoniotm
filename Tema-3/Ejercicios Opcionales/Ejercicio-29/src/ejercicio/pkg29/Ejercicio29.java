package ejercicio.pkg29;

import java.util.Scanner;

public class Ejercicio29 {

    /**
     * @author Antonio
     * Ejercicio-29
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           
           int aleatorio = (int) (Math.random()* 100);
           
           int intentos;
           int fallos = 0;
           
            System.out.println("Bienvenido tienes  que adivinar un numero entre el 1 y el 100");
            
            do {            
                System.out.println("Por favor introduce el numero que crees que es: ");
                intentos = sc.nextInt();
                
                fallos++;
                
                if (intentos < aleatorio) {
                    System.out.println("El numero es Mayor");
                }
                else if (intentos > aleatorio) {
                    System.out.println("El numero es Menor");
                }
                else {
                    System.out.println("El numero es Correcto");
                    System.out.println("Has necesitado " + fallos + " intentos");
                }
            } while (intentos != aleatorio);
    }
    
}
