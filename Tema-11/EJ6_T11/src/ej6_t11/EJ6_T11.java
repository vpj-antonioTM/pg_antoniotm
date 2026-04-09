package ej6_t11;

import java.util.Scanner;

public class EJ6_T11 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        Campania campania = new Campania("Campania de donaciones");
        int opcion;

        do {
            System.out.println("Menu de la campania");
            System.out.println("1. Anadir donacion");
            System.out.println("2. Mostrar donaciones");
            System.out.println("3. Mostrar donaciones por nombre");
            System.out.println("4. Mostrar numero de donaciones");
            System.out.println("5. Mostrar total recaudado");
            System.out.println("6. Salir");
            System.out.println("Elige una opcion:");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Nombre del donante:");
                    String nombre = entrada.nextLine();
                    System.out.println("Cantidad donada:");
                    double cantidad = entrada.nextDouble();
                    entrada.nextLine();

                    campania.addDonacion(new Donacion(nombre, cantidad));
                }

                case 2 ->
                    campania.mostrarDonaciones();

                case 3 -> {
                    System.out.println("Introduce el nombre del donante:");
                    String nombre = entrada.nextLine();
                    campania.mostrarPorNombre(nombre);
                }

                case 4 ->
                    System.out.println("Numero de donaciones: " + campania.getNumeroDonaciones());

                case 5 ->
                    System.out.println("Total recaudado: " + campania.getTotalRecaudado());

                case 6 ->
                    System.out.println("Saliendo...");

                default ->
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 6);
    }
}