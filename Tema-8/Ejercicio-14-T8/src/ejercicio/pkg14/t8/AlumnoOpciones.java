/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg14.t8;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class AlumnoOpciones {

    private Alumno[] alumnos;
    private Scanner entrada;

    public AlumnoOpciones() {
        alumnos = new Alumno[5];
        entrada = new Scanner(System.in);
        
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new Alumno();
        }
    }
// 1. Rellenar Alumno
    public void rellenarAlumno() {
        int posicion = 0;

        do {
            System.out.println("introduce una posicion entre 0 y 4: ");
            posicion = entrada.nextInt();
            entrada.nextLine();

            if (posicion < 0 && posicion > 4) {
                System.out.println("Posicion Invalida");
            } else if (alumnos[posicion].getNombre() != null) {
                System.out.println("Posicion ya ocupada");
                posicion = -1;
            }
        } while (posicion < 0 && posicion > 4);

        System.out.println("Nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("Edad: ");
        int edad = entrada.nextInt();

        System.out.println("Nota media: ");
        double notaMedia = entrada.nextDouble();

        alumnos[posicion] = new Alumno(nombre, edad, notaMedia);
        System.out.println("Alumno insertado correctamente");
    }
    
    //2. Mostrar vector
    public void mostrarAlumnos() {
        System.out.println("Lista de alumnos: ");
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getNombre() != null) {
                System.out.println("Posicion " + i + ": " + alumnos[i]);
            }
        }
    }
    
    //3. Mostrar alumnos con nota superior a X
}
