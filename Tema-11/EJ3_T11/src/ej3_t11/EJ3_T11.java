package ej3_t11;

import java.util.Scanner;

public class EJ3_T11 {

    static Scanner entrada = new Scanner(System.in);
    static Autobus[] darsenas = new Autobus[6];

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("Menu de la estacion");
            System.out.println("1. Aparcar autobus");
            System.out.println("2. Mostrar darsenas libres");
            System.out.println("3. Buscar autobus por matricula");
            System.out.println("4. Buscar conductor por DNI");
            System.out.println("5. Autobus con mas conductores");
            System.out.println("6. Salir");
            System.out.println("Elige una opcion");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1 -> aparcarAutobus();
                case 2 -> mostrarLibres();
                case 3 -> buscarAutobus();
                case 4 -> buscarConductor();
                case 5 -> autobusConMasConductores();
                case 6 -> System.out.println("Saliendo");
                default -> System.out.println("Opcion no valida");
            }
        } while (opcion != 6);
    }

    public static void aparcarAutobus() {
        int aparcamiento;
        do {
            System.out.println("Introduce un aparcamiento del 0 al 5");
            aparcamiento = entrada.nextInt();
            entrada.nextLine();
        } while (aparcamiento < 0 || aparcamiento > 5 || darsenas[aparcamiento] != null);

        System.out.println("Matricula del autobus: ");
        String matricula = entrada.nextLine();

        Autobus a = new Autobus(matricula);

        System.out.println("Cuantos conductores quieres anadir?");
        int n = entrada.nextInt();
        entrada.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("DNI del conductor: ");
            String dni = entrada.nextLine();
            System.out.println("Nombre del conductor: ");
            String nombre = entrada.nextLine();
            a.addConductor(new Conductor(dni, nombre));
        }

        darsenas[aparcamiento] = a;
        System.out.println("Autobus aparcado correctamente.");
    }

    public static void mostrarLibres() {
        System.out.println("Darsenas libres: ");
        for (int i = 0; i < darsenas.length; i++) {
            if (darsenas[i] == null) {
                System.out.println(" - Posicion " + i);
            }
        }
    }

    public static void buscarAutobus() {
        System.out.println("Introduce matricula: ");
        String mat = entrada.nextLine();

        for (Autobus a : darsenas) {
            if (a != null && a.getMatricula().equalsIgnoreCase(mat)) {
                System.out.println(a);
                return;
            }
        }
        System.out.println("No se ha encontrado.");
    }

    public static void buscarConductor() {
        System.out.println("Introduce el DNI del conductor: ");
        String dni = entrada.nextLine();

        for (Autobus a : darsenas) {
            if (a != null && a.getConductores().containsKey(dni)) {
                System.out.println("El conductor esta en el autobus con matricula: " + a.getMatricula());
                return;
            }
        }
        System.out.println("No se ha encontrado.");
    }

    public static void autobusConMasConductores() {
        int max = -1;
        int posmax = -1;

        for (int i = 0; i < darsenas.length; i++) {
            if (darsenas[i] != null) {
                int num = darsenas[i].getConductores().size();
                if (num > max) {
                    max = num;
                    posmax = i;
                }
            }
        }

        if (posmax == -1) {
            System.out.println("No hay autobuses aparcados");
        } else {
            System.out.println("El autobus con mas conductores esta en la posicion " + posmax);
            System.out.println(darsenas[posmax]);
        }
    }
}