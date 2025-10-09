package ejercicio.pkg07;

import java.util.Scanner;

public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner dato1 = new Scanner (System.in);
           System.out.println("Por favor, introduzca una nota del 1 al 7: ");
           
           int diasemana = dato1.nextInt() ;
           boolean laborable = false;
           
           switch (diasemana) {
                      case 1:
                      case 2:
                      case 3:
                      case 4:
                      case 5:
                            laborable = true;
                            break;
                      case 6:
                      case 7:
                            laborable = false;
           }
           System.out.println("El dia es laborable " + diasemana + " es " + laborable);
           }
    }
    
