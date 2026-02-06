package ejercicio.pkg15.t8;

import java.util.Scanner;

public class Ejercicio15T8 {

    static Peliculas[] peliculas = new Peliculas[3]; 
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int seleccion;
        do {
            opciones();
            seleccion = entrada.nextInt();

            switch (seleccion) {
                case 1 -> rellenarPeliculas();
                case 2 -> mostrarPeliculas();
                case 3 -> masRentable();
                case 4 -> menosRentable();
                case 5 -> beneficioPorNombre();
                case 6 -> contarSociosMayorX();
                case 7 -> System.out.println("Adiós");
                default -> System.out.println("Por favor, introduce un número válido.");
            }

        } while (seleccion != 7);
    }

    public static void opciones() {
        System.out.println("Elige una de las opciones");
        System.out.println("-------------------------");
        System.out.println("1. Rellenar las pelis");
        System.out.println("2. Mostrar las pelis");
        System.out.println("3. Mostrar más rentable");
        System.out.println("4. Mostrar menos rentable");
        System.out.println("5. Beneficio neto por película");
        System.out.println("6. Socios que abonaron más de X");
        System.out.println("7. Salir");
        System.out.println("-------------------------");
    }

    public static void rellenarPeliculas() {
        for (int i = 0; i < peliculas.length; i++) {
            System.out.println("Película " + (i + 1));
            System.out.print("Título: ");
            String titulo = entrada.next();

            System.out.print("Coste licencia: ");
            float licencia = entrada.nextFloat();

            System.out.print("Número de socios: ");
            int numSocios = entrada.nextInt();

            peliculas[i] = new Peliculas();
            peliculas[i].setTitulo(titulo);
            peliculas[i].setCosteLicencia(licencia);
            peliculas[i].setSociosPelis(new Socios[numSocios]);

            for (int j = 0; j < numSocios; j++) {
                System.out.println(" Socio " + (j + 1));
                System.out.print("  Nombre: ");
                String nombre = entrada.next();

                System.out.print("  Precio abonado: ");
                float precio = entrada.nextFloat();

                peliculas[i].getSociosPelis()[j] = new Socios(nombre, precio);
            }
        }
    }

    public static void mostrarPeliculas() {
        for (Peliculas p : peliculas) {
            if (p != null) {
                p.mostrar();
                System.out.println("---------------------");
            }
        }
    }

    public static float beneficio(Peliculas p) {
        float total = 0;
        for (Socios s : p.getSociosPelis()) {
            total += s.getPrecioAbonado();
        }
        return total - p.getCosteLicencia();
    }

    public static void masRentable() {
        Peliculas mejor = peliculas[0];

        for (int i = 1; i < peliculas.length; i++) {
            if (beneficio(peliculas[i]) > beneficio(mejor)) {
                mejor = peliculas[i];
            }
        }

        System.out.println("Película más rentable:");
        System.out.println(mejor.getTitulo());
        System.out.println("Beneficio: " + beneficio(mejor));
    }

    public static void menosRentable() {
        Peliculas peor = peliculas[0];

        for (int i = 1; i < peliculas.length; i++) {
            if (beneficio(peliculas[i]) < beneficio(peor)) {
                peor = peliculas[i];
            }
        }

        System.out.println("Película menos rentable:");
        System.out.println(peor.getTitulo());
        System.out.println("Beneficio: " + beneficio(peor));
    }

    public static void beneficioPorNombre() {
        System.out.print("Introduce el título de la película: ");
        String titulo = entrada.next();

        for (Peliculas p : peliculas) {
            if (p.getTitulo().equalsIgnoreCase(titulo)) {
                p.mostrar();
                System.out.println("Beneficio neto: " + beneficio(p));
                return;
            }
        }
        System.out.println("Película no encontrada.");
    }

    public static void contarSociosMayorX() {
        System.out.print("Introduce la cantidad: ");
        float cantidad = entrada.nextFloat();
        int contador = 0;

        for (Peliculas p : peliculas) {
            for (Socios s : p.getSociosPelis()) {
                if (s.getPrecioAbonado() > cantidad) {
                    contador++;
                }
            }
        }

        System.out.println("Socios que abonaron más de " + cantidad + ": " + contador);
    }
}
