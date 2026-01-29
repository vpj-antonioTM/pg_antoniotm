package ejercicio.pkg16.t7;

import java.util.Scanner;

public class Ejercicio16T7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Creo un String que contiene los alumnos
        String[] alumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "Maria"};
        //Creo un String que contiene las Asignaturas
        String[] asignaturas = {"Lengua", "Mates", "Historia", "Fisica"};
        //Matriz de notas que contiene los 6 alumnos x 4 asignaturas
        int[][] notas = new int[6][4];

        int opcion;

        do {
            System.out.println("Menu de Acciones");
            System.out.println("1. Rellenar las notas de los alumnos");
            System.out.println("2. Mostrar las notas");
            System.out.println("3. Mostrar el mejor alumno");
            System.out.println("4. Mostrar el alumno con mas suspensos");
            System.out.println("5. Mostrar la asignatura mas dificil");
            System.out.println("6. Salir");
            System.out.println("Elige una opcion");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    //Generador de notas aleatorias entre 0 y 10
                    System.out.println("Rellenar notas");
                    for (int i = 0; i < alumnos.length; i++) {
                        for (int j = 0; j < asignaturas.length; j++) {
                            notas[i][j] = (int) (Math.random() * 11);
                        }
                    }
                    //Mostrar si las notas se han generado correctamente
                    System.out.println("Notas generadas correctamente");
                    break;

                case 2:
                    //Mostrar todas las notas generadas
                    System.out.println("\nMostrar Notas");
                    for (int i = 0; i < alumnos.length; i++) {
                        System.out.println(alumnos[i] + ": "); //Muestra los nombres d elos alumnos
                        for (int j = 0; j < asignaturas.length; j++) {
                            System.out.println(asignaturas[j] + " = " + notas[i][j]); //Muestra las asignaturas y la notas 
                        }
                        System.out.println(); //Para separar y quede mas "bonito"
                    }
                    break;

                case 3:
                    //Calcula el alumno con mejor media
                    int mejorMedia = -1; //empieza desde -1 por que el array empieza en 0
                    String mejorAlumno = "";

                    for (int i = 0; i < alumnos.length; i++) {
                        int suma = 0;
                        for (int j = 0; j < asignaturas.length; j++) {
                            suma += notas[i][j]; //suma de toas las notas de cada alumno
                        }
                        //Calcula la media
                        int media = suma / asignaturas.length;

                        //Va guardando las mejores medias para quedarse con la mejor
                        if (media > mejorMedia) {
                            mejorMedia = media;
                            mejorAlumno = alumnos[i];
                        }
                    }

                    System.out.println("El mejor alumno es " + mejorAlumno + " con media " + mejorMedia);
                    break;

                case 4:
                    //Calcula el alumno con mas suspensos
                    int maxSuspensos = -1;
                    String alumnosSuspensos = "";

                    for (int i = 0; i < alumnos.length; i++) {
                        int suspensos = 0;
                        for (int j = 0; j < asignaturas.length; j++) {
                            if (notas[i][j] < 5) suspensos++; //Si la nota es menos de 5 suma 1 a suspensos
                        }
                        //Va guardando el que tenga mas suspensos
                        if (suspensos > maxSuspensos) {
                            maxSuspensos = suspensos;
                            alumnosSuspensos = alumnos[i];
                        }
                    }
                    
                    System.out.println("El alumno con mas asignaturas suspensas es " + alumnosSuspensos
                            + " con " + maxSuspensos + " suspensos");
                    break;

                case 5:
                    //Busca la asignatura mas dificil
                    int peorMedia = 999;
                    String asignaturaDificil = "";

                    for (int j = 0; j < asignaturas.length; j++) {
                        int suma = 0;
                        for (int i = 0; i < alumnos.length; i++) {
                            suma += notas[i][j]; //Suma todas las notas de cada alumno
                        }
                        //Calcula la media
                        int media = suma / alumnos.length;
                        
                        //Si la media es la mas baja la guarda
                        if (media < peorMedia) {
                            peorMedia = media;
                            asignaturaDificil = asignaturas[j];
                        }
                    }

                    System.out.println("La asignatura mas dificil es " + asignaturaDificil
                            + " con media de " + peorMedia);
                    break;

                case 6:
                    //Salir del programa
                    System.out.println("Saliendo del menu");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 6);
    }
}

