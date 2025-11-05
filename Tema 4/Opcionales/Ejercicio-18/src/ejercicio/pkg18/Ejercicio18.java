package ejercicio.pkg18;

import com.sun.nio.file.SensitivityWatchEventModifier;
import java.util.Scanner;

public class Ejercicio18 {

    /**
     * @author Antonio
     * Ejercicio-18
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           String nombre = pedirNombre();
           nombreCincoVeces (nombre);
            }
           public static String pedirNombre() {
               Scanner entrada = new Scanner (System.in);
               System.out.print("Introduzca su nombre: ");
               String nombre = entrada.nextLine();
               return nombre;
           }
           public static void nombreCincoVeces(String nombre) {
               for(int i = 0; i < 5;  i++){
                   System.out.println(nombre);
               }
           }
    }
    

