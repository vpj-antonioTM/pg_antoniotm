package ejercicio.pkg06.t10;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio06T10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> ventas = new ArrayList<>();

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        int opcion;

        do {
            System.out.println("\nMenu de Ventas Coches");
            System.out.println("1. Introduce las ventas de coches cada uno de los 12 meses del ano");
            System.out.println("2. Mostrar ventas");
            System.out.println("3. Mostrar ventas al reves");
            System.out.println("4. Mostrar suma total de ventas del ano");
            System.out.println("5. Mostrar ventas de meses con 'a'");
            System.out.println("6. Mostrar mes o meses con mas ventas");
            System.out.println("7. Salir del programa");
            System.out.print("Elige una opcion: ");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 -> rellenarVentas(ventas, meses);
                case 2 -> mostrarVentas(ventas, meses);
                case 3 -> mostrarVentasReves(ventas, meses);
                case 4 -> sumaTotal(ventas);
                case 5 -> ventasConA(ventas, meses);
                case 6 -> mesConMasVentas(ventas, meses);
                case 7 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 7);
    }

    public static void rellenarVentas(ArrayList<Integer> ventas, String[] meses) {
        Scanner entrada = new Scanner(System.in);
        ventas.clear();

        System.out.println("\nIntroduce las ventas de cada mes: ");
        for (int i = 0; i < 12; i++) {
            System.out.print("Ventas de " + meses[i] + ": ");
            ventas.add(entrada.nextInt());
        }
    }

    public static void mostrarVentas(ArrayList<Integer> ventas, String[] meses) {
        if (ventas.isEmpty()) {
            System.out.println("Primero debes introducir las ventas (opción 1).");
            return;
        }

        System.out.println("\nVentas introducidas:");
        for (int i = 0; i < ventas.size(); i++) {
            System.out.println(meses[i] + " : " + ventas.get(i));
        }
    }

    public static void mostrarVentasReves(ArrayList<Integer> ventas, String[] meses) {
        if (ventas.isEmpty()) {
            System.out.println("Primero debes introducir las ventas (opción 1).");
            return;
        }

        System.out.println("\nVentas al revés:");
        for (int i = ventas.size() - 1; i >= 0; i--) {
            System.out.println(meses[i] + " : " + ventas.get(i));
        }
    }

    public static void sumaTotal(ArrayList<Integer> ventas) {
        if (ventas.isEmpty()) {
            System.out.println("Primero debes introducir las ventas (opción 1).");
            return;
        }

        int suma = 0;
        for (int v : ventas) {
            suma += v;
        }
        System.out.println("Suma total del año: " + suma);
    }

    public static void ventasConA(ArrayList<Integer> ventas, String[] meses) {
        if (ventas.isEmpty()) {
            System.out.println("Primero debes introducir las ventas (opción 1).");
            return;
        }

        int total = 0;
        System.out.println("\nMeses con 'a':");
        for (int i = 0; i < meses.length; i++) {
            if (meses[i].toLowerCase().contains("a")) {
                System.out.println(meses[i] + " : " + ventas.get(i));
                total += ventas.get(i);
            }
        }
        System.out.println("Total acumulado: " + total);
    }

    public static void mesConMasVentas(ArrayList<Integer> ventas, String[] meses) {
        if (ventas.isEmpty()) {
            System.out.println("Primero debes introducir las ventas (opción 1).");
            return;
        }

        int max = ventas.get(0);
        for (int v : ventas) {
            if (v > max) {
                max = v;
            }
        }

        System.out.println("\nMes(es) con más ventas (" + max + "):");
        for (int i = 0; i < ventas.size(); i++) {
            if (ventas.get(i) == max) {
                System.out.println(meses[i]);
            }
        }
    }
}