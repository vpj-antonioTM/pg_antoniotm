package ejercicio.pkg30;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio30 {

    /**
     * @author Antonio
     * Ejercicio-30
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           
           int aleatorio = (int) (Math.random()* 100);
           
           int intentos;
           int fallos = 0;
           boolean acierto = false;
           
            System.out.println("Bienvenido tienes  que adivinar un numero entre el 1 y el 100");
            
            while (!acierto) {            
                System.out.println("Por favor introduce el numero que crees que es: ");
                try {
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
                } catch (InputMismatchException e){
                         System.out.println("!ERROR¡ Debes introducir valores enteros no caracteres");
                         sc.nextLine();
                         }
                }
            }
    }
