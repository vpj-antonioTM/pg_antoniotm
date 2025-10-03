package ejercicio.pkg24;

import java.util.Scanner;

public class Ejercicio24 {

    /**
     * @author Antonio
     * Ejercicio-24
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Clase Scanner
        Scanner datos = new Scanner (System.in);
        
        //Nota Programación
        System.out.println("Por favor, introduzca la nota de Programación: ");
        int pg = datos.nextInt();
        
        //Nota Lenguaje de Marcas
        System.out.println("Introduzca la nota de Lenguajes de Marcas: ");
        int lmsgi = datos.nextInt();
        
        //Nota Base de Datos
        System.out.println("Introduzca la nota de Bases de Datos: ");
        int bd = datos.nextInt();
        
        //Nota Entornos de Desarrollo
        System.out.println("Introduzca la nota de Entornos de Desarrollo: ");
        int ed = datos.nextInt();
        
        //Nota Sistemas Informaticós
        System.out.println("Introduzca la nota de Sistemas Informáticos: ");
        int si = datos.nextInt();
        
        //Nota de Formación y Orientación Laboral
        System.out.println("Por último, introduzca la nota de Formación y Orientación Laboral: ");
        int fol = datos.nextInt();
        
        //Nota media de todas las asignaturas
        int notaMedia = (pg + lmsgi + bd + ed + si + fol) / 6;
        System.out.println("Su nota media del curso es de: " + notaMedia);
    }
    
}
