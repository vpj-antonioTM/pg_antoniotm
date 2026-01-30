/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg14.t8;

import java.util.Scanner;
import javax.xml.stream.util.EventReaderDelegate;

/**
 *
 * @author alumno
 */
public class Ejercicio14T8 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        AlumnoOpciones opciones = new AlumnoOpciones();
        
        int opcion=0;
        
        do {
            System.out.println("Menu de Opciones");
            System.out.println("1. Rellernar un alumno");
            System.out.println("2. Mostrar vector de alumnos");
            System.out.println("3. Mostrar alumnos con nota media superior a X");
            System.out.println("4. Mostrar cuantos alumnos estan suspensos");
            System.out.println("5. Buscar alumno por Nombre");
            System.out.println("6. Salir");
            System.out.println("Elige una de las opciones");
            opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch (opcion) {
            
                case 1 -> opciones.rellenarAlumno();
                case 2 -> opciones.mostrarAlumnos();
            }
        }
        while (opcion != 6);
    }
}
