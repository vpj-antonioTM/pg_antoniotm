package ej8_t11;

import java.util.ArrayList;
import java.util.Scanner;

public class EJ8_T11 {

    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Ciudad> ciudades = new ArrayList<>();

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("Menu de gestion de sedes");
            System.out.println("1. Anadir ciudad");
            System.out.println("2. Mostrar ciudades y sedes");
            System.out.println("3. Mostrar sedes con ingresos superiores a la media");
            System.out.println("4. Buscar sede por nombre");
            System.out.println("5. Anadir sede a una ciudad");
            System.out.println("6. Mostrar sedes ordenadas por ingresos");
            System.out.println("7. Salir");
            System.out.println("Elige una opcion:");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1 ->
                    anadirCiudad();
                case 2 ->
                    mostrarCiudades();
                case 3 ->
                    sedesSuperioresMedia();
                case 4 ->
                    buscarSede();
                case 5 ->
                    anadirSedeCiudad();
                case 6 ->
                    mostrarSedesOrdenadas();
                case 7 ->
                    System.out.println("Saliendo");
                default ->
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 7);
    }

    public static void anadirCiudad() {
        System.out.println("Nombre de la ciudad:");
        String nombre = entrada.nextLine();

        Ciudad c = new Ciudad(nombre);

        String seguir;
        do {
            System.out.println("Nombre de la sede:");
            String sedeNombre = entrada.nextLine();
            System.out.println("Ingresos anuales:");
            double ingresos = entrada.nextDouble();
            entrada.nextLine();

            c.addSede(new Sede(sedeNombre, ingresos));

            System.out.println("Deseas anadir otra sede? (s/n)");
            seguir = entrada.nextLine();

        } while (seguir.equalsIgnoreCase("s"));

        ciudades.add(c);
        System.out.println("Ciudad anadida correctamente.");
    }

    public static void mostrarCiudades() {
        if (ciudades.isEmpty()) {
            System.out.println("No hay ciudades registradas.");
            return;
        }

        for (Ciudad c : ciudades) {
            System.out.println(c);
        }
    }

    public static void sedesSuperioresMedia() {
        double total = 0;
        int contador = 0;

        for (Ciudad c : ciudades) {
            for (Sede s : c.getSedes()) {
                total += s.getIngresos();
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("No hay sedes registradas.");
            return;
        }

        double media = total / contador;

        System.out.println("Media de ingresos: " + media);
        System.out.println("Sedes con ingresos superiores a la media:");

        for (Ciudad c : ciudades) {
            for (Sede s : c.getSedes()) {
                if (s.getIngresos() > media) {
                    System.out.println(s);
                }
            }
        }
    }

    public static void buscarSede() {
        System.out.println("Introduce el nombre de la sede:");
        String nombre = entrada.nextLine();

        for (Ciudad c : ciudades) {
            for (Sede s : c.getSedes()) {
                if (s.getNombre().equalsIgnoreCase(nombre)) {
                    System.out.println("Sede encontrada en la ciudad: " + c.getNombre());
                    System.out.println(s);
                    return;
                }
            }
        }

        System.out.println("No se ha encontrado la sede.");
    }

    public static void anadirSedeCiudad() {
        System.out.println("Introduce el nombre de la ciudad:");
        String nombre = entrada.nextLine();

        for (Ciudad c : ciudades) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {

                System.out.println("Nombre de la nueva sede:");
                String sedeNombre = entrada.nextLine();
                System.out.println("Ingresos anuales:");
                double ingresos = entrada.nextDouble();
                entrada.nextLine();

                c.addSede(new Sede(sedeNombre, ingresos));
                System.out.println("Sede anadida correctamente.");
                return;
            }
        }

        System.out.println("La ciudad no existe.");
    }

    public static void mostrarSedesOrdenadas() {

        ArrayList<Sede> listaOrdenada = new ArrayList<>();

        for (Ciudad c : ciudades) {
            for (Sede s : c.getSedes()) {

                int i = 0;
                while (i < listaOrdenada.size() && listaOrdenada.get(i).getIngresos() > s.getIngresos()) {
                    i++;
                }

                listaOrdenada.add(i, s);
            }
        }

        System.out.println("Sedes ordenadas por ingresos de mayor a menor:");
        for (Sede s : listaOrdenada) {
            System.out.println(s);
        }
    }
}