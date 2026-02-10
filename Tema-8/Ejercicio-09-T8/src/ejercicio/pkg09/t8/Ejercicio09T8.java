package ejercicio.pkg09.t8;

import java.util.Scanner;

public class Ejercicio09T8 {

    public static void main(String[] args) {

        // Scanner
        Scanner entrada = new Scanner(System.in);

        // Array con los 3 alumnos del aula
        Alumno[] aula = {
            new Alumno("Sergio"),
            new Alumno("Juan"),
            new Alumno("Rosa")
        };

        int opcion;

        // Menu principal
        do {
            System.out.println("\nMENU OPCIONES");
            System.out.println("1. Rellenar notas");
            System.out.println("2. Mostrar notas");
            System.out.println("3. Mejor alumno");
            System.out.println("4. Alumno con mas suspensos");
            System.out.println("5. Asignatura mas dificil");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion: ");
            opcion = entrada.nextInt();

            // Opciones del menu
            switch (opcion) {
                case 1:
                    rellenarNotas(aula, entrada);
                    break;
                case 2:
                    mostrarNotas(aula);
                    break;
                case 3:
                    mejorAlumno(aula);
                    break;
                case 4:
                    alumnoConMasSuspensos(aula);
                    break;
                case 5:
                    asignaturaMasDificil(aula);
                    break;
                case 6:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 6);
    }

    // Rellenar notas de todos los alumnos
    public static void rellenarNotas(Alumno[] aula, Scanner entrada) {
        for (Alumno alumno : aula) {
            System.out.println("\nIntroduce notas de " + alumno.getNombreAlumno());
            for (Asignatura asig : alumno.getNotas()) {
                System.out.print(asig.getNombreAsignatura() + ": ");
                double nota = entrada.nextDouble();   // lectura de nota
                asig.setNota(nota);                   // guardamos la nota en el getter
            }
        }
    }

    // Mostrar todas las notas de todos los alumnos
    public static void mostrarNotas(Alumno[] aula) {
        for (Alumno alumno : aula) {
            System.out.println("\nNotas de " + alumno.getNombreAlumno() + ":");
            for (Asignatura asig : alumno.getNotas()) {
                System.out.println(asig.getNombreAsignatura() + ": " + asig.getNota());
            }
        }
    }

    // Calcular qué alumno tiene la media más alta
    public static void mejorAlumno(Alumno[] aula) {
        double mejorMedia = -1;
        String mejorAlumno = "";

        for (Alumno alumno : aula) {
            double suma = 0;

            // Sumamos todas las notas del alumno
            for (Asignatura asig : alumno.getNotas()) {
                suma += asig.getNota();
            }

            // Calculamos la media
            double media = suma / alumno.getNotas().length;

            // Comprobamos si es la mejor media encontrada
            if (media > mejorMedia) {
                mejorMedia = media;
                mejorAlumno = alumno.getNombreAlumno();
            }
        }
        // Mostramos
        System.out.println("\nEl mejor alumno es: " + mejorAlumno + " con media " + mejorMedia);
    }

    // Alumno con más suspensos
    public static void alumnoConMasSuspensos(Alumno[] aula) {
        int maxSuspensos = -1;
        String alumnoConMasSuspensos = "";

        for (Alumno alumno : aula) {
            int suspensos = 0;

            // Contamos las asignaturas suspensas
            for (Asignatura asig : alumno.getNotas()) {
                if (asig.getNota() < 5) suspensos++;
            }

            // Comprobamos si es el que mas suspensos tiene
            if (suspensos > maxSuspensos) {
                maxSuspensos = suspensos;
                alumnoConMasSuspensos = alumno.getNombreAlumno();
            }
        }
        // Mostramos
        System.out.println("\nEl alumno con más suspensos es: " + alumnoConMasSuspensos);
    }

    // Asignatura más difícil
    public static void asignaturaMasDificil(Alumno[] aula) {

        // Nombres de las asignaturas en orden
        String[] nombresAsig = {"Lengua", "Mates", "Historia", "Física"};

        // Array para guardar la media de cada asignatura
        double[] medias = new double[4];

        // for que calcula la media de cada asignatura
        for (int i = 0; i < 4; i++) {
            double suma = 0;

            for (Alumno alumno : aula) {
                suma += alumno.getNotas()[i].getNota();
            }

            medias[i] = suma / aula.length;
        }

        double peorMedia = 999;
        String asignaturaDificil = "";

        // Bfor que busca la media ams baja
        for (int i = 0; i < 4; i++) {
            if (medias[i] < peorMedia) {
                peorMedia = medias[i];
                asignaturaDificil = nombresAsig[i];
            }
        }
        // Mostramos
        System.out.println("\nLa asignatura más difícil es: " + asignaturaDificil);
    }
}