/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg13.t8;

import java.time.temporal.JulianFields;

/**
 *
 * @author alumno
 */
public class Ejercicio13T8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Objeto usando el constructor por defecto
        Alumno alumno = new Alumno();
        alumno.setNombre("Antonio");
       alumno.setEdad(22);
       alumno.setNotaMedia(6);
       
       //Objeto usando el constructor parametrizado
       Alumno alumno2 = new Alumno("Juan", 20, 7);
       
       //Mostrar
        System.out.println("Informacion de los alumnos:");
        System.out.println(alumno);
        System.out.println(alumno2);
    }
    
}
