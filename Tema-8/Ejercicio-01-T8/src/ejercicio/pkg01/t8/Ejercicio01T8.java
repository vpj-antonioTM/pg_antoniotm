/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg01.t8;

import java.util.Scanner;

/**
 *
 * @author antonio
 */
public class Ejercicio01T8 {

    public static class Asignatura {

        private String nombre;
        private int nota;

        //Constructor por defecto
        public Asignatura() {
            this.nombre = "0";
            this.nota = 0;
        }

        //Constructor con parámetros
        public Asignatura(String nombre, int nota) {
            this.nombre = nombre;
            this.nota = nota;
        }

        //Getter y Setter
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getNota() {
            return nota;
        }

        public void setNota(int nota) {
            this.nota = nota;
        }
    }

    public static class CalcularMedia {

        public static int calcularMedia(Asignatura[] asignaturas) {

            int suma = 0; //Acumula las notas

            //Se recorre el array para ir sumandos las notas
            for (int i = 0; i < asignaturas.length; i++) {
                suma += asignaturas[i].getNota();
            }

            //Devuelve la media
            return suma / asignaturas.length;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Asignaturas
        String[] nombres = {
            "Programacion",
            "Lenguaje de marcas",
            "Base de datos",
            "Entrornos de desarrollo",
            "Sistemas informaticos",
            "Formacion y orientacion laboral"
        };

        //Array donde se guardan las asignaturas
        Asignatura[] asignaturas = new Asignatura[6];

        //Pedir las notas
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println("Introduzca la nota de " + nombres[i] + ": ");
            int nota = entrada.nextInt();
            asignaturas[i] = new Asignatura(nombres[i], nota);
        }

        //Llamar al metodo que calcula la media
        int media = CalcularMedia.calcularMedia(asignaturas);

        //Mostramos el resultado
        System.out.println("Su nota media es de: " + media);
    }

}
