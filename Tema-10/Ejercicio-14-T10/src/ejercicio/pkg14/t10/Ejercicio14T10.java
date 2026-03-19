package ejercicio.pkg14.t10;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio14T10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n1. Introducir un nuevo alumno y sus notas.");
            System.out.println("2. Mostrar alumnos introducidos.");
            System.out.println("3. Mostrar el mejor alumno (mayor media).");
            System.out.println("4. Mostrar la asignatura más difícil (más suspensos).");
            System.out.println("5. Salir.");
            System.out.print("Elige una opción: ");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1 -> añadirAlumno(listaAlumnos, entrada);
                case 2 -> mostrarAlumnos(listaAlumnos);
                case 3 -> mostrarMejorAlumno(listaAlumnos);
                case 4 -> asignaturaMasDificil(listaAlumnos);
                case 5 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }
        }
        while (opcion != 5);
    }

    public static void añadirAlumno(ArrayList<Alumno> lista, Scanner entrada) {
        System.out.print("Nombre del alumno: ");
        String nombre = entrada.nextLine();

        Alumno al = new Alumno(nombre);

        String[] nombresAsignaturas = {"Lengua", "Mates", "Física"};

        for (String asig : nombresAsignaturas) {
            System.out.print("Nota de " + asig + ": ");
            float nota = entrada.nextFloat();
            entrada.nextLine();

            al.asignaturas.add(new Asignatura(asig, nota));
        }

        lista.add(al);
        System.out.println("Alumno añadido correctamente.");
    }


    public static void mostrarAlumnos(ArrayList<Alumno> lista) {
        if (lista.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
            return;
        }

        for (Alumno a : lista) {
            System.out.println("\nAlumno: " + a.nombreAlumno);
            for (Asignatura as : a.asignaturas) {
                System.out.println(" - " + as);
            }
            System.out.println("Media: " + a.calcularMedia());
        }
    }


    public static void mostrarMejorAlumno(ArrayList<Alumno> lista) {
        if (lista.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
            return;
        }

        Alumno mejor = lista.get(0);

        for (Alumno a : lista) {
            if (a.calcularMedia() > mejor.calcularMedia()) {
                mejor = a;
            }
        }

        System.out.println("\nEl mejor alumno es: " + mejor.nombreAlumno +
                " con media " + mejor.calcularMedia());
    }


    public static void asignaturaMasDificil(ArrayList<Alumno> lista) {
        if (lista.isEmpty()) {
            System.out.println("No hay alumnos registrados.");
            return;
        }

        int suspLengua = 0, suspMates = 0, suspFisica = 0;

        for (Alumno a : lista) {
            for (Asignatura as : a.asignaturas) {
                if (as.getNota() < 5) {
                    switch (as.getNombreAsignatura()) {
                        case "Lengua" -> suspLengua++;
                        case "Mates" -> suspMates++;
                        case "Física" -> suspFisica++;
                    }
                }
            }
        }

        String masDificil = "Lengua";
        int max = suspLengua;

        if (suspMates > max) {
            masDificil = "Mates";
            max = suspMates;
        }
        if (suspFisica > max) {
            masDificil = "Física";
        }

        System.out.println("\nLa asignatura más difícil es: " + masDificil);
    }
}
