package ejercicio.pkg15.t8;

import java.util.Scanner;

public class Ejercicio15T8 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Creamos el vector donde guardaremos las 3 películas
        Peliculas[] peliculas = new Peliculas[3];

        int opcion;

        do {
            System.out.println("\nMENU");
            System.out.println("1. Rellenar peliculas y socios");
            System.out.println("2. Mostrar peliculas y socios");
            System.out.println("3. Película mas rentable");
            System.out.println("4. Película menos rentable");
            System.out.println("5. Buscar pelicula y mostrar beneficio + socios");
            System.out.println("6. Contar socios que han pagado mas de X");
            System.out.println("7. Salir");
            System.out.print("Elige una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpia el salto de línea

            switch (opcion) {

                case 1 -> rellenarPeliculas(peliculas, entrada);

                case 2 -> mostrarPeliculas(peliculas);

                case 3 -> peliculaMasRentable(peliculas);

                case 4 -> peliculaMenosRentable(peliculas);

                case 5 -> buscarPelicula(peliculas, entrada);

                case 6 -> contarSociosQuePagaronMas(peliculas, entrada);

                case 7 -> System.out.println("Saliendo del programa");

                default -> System.out.println("Opcion no valida");
            }

        } while (opcion != 7);
    }

    // Rellenar películas y socios
    public static void rellenarPeliculas(Peliculas[] peliculas, Scanner entrada) {

        // Recorremos las 3 posiciones del vector de películas
        for (int i = 0; i < peliculas.length; i++) {

            System.out.println("\nIntroduce datos de la pelicula " + (i + 1));

            // Pedimos el titulo
            System.out.print("Titulo: ");
            String titulo = entrada.nextLine();

            // Pedimos el coste de licencia
            System.out.print("Coste de licencia: ");
            double coste = entrada.nextDouble();
            entrada.nextLine();

            // Creamos la pelicula con los datos introducidos
            peliculas[i] = new Peliculas(titulo, coste);

            // Ahora rellenamos los 4 socios que asistieron
            for (int j = 0; j < 4; j++) {

                System.out.println("Socio " + (j + 1) + ":");

                // Pedimos el nombre del socio
                System.out.print("Nombre: ");
                String nombre = entrada.nextLine();

                // Pedimos cuanto ha pagado
                System.out.print("Precio abonado: ");
                double precio = entrada.nextDouble();
                entrada.nextLine();

                // Guardamos el socio dentro de la pelicula
                peliculas[i].setSocio(j, new Socios(nombre, precio));
            }
        }
    }

    // Mostrar peliculas y socios
    public static void mostrarPeliculas(Peliculas[] peliculas) {

        // Recorremos todas las peliculas
        for (Peliculas p : peliculas) {

            // Mostramos titulo y coste
            System.out.println("\nPelicula: " + p.getTitulo());
            System.out.println("Coste licencia: " + p.getCosteLicencia());
            System.out.println("Socios asistentes:");

            // Recorremos los 4 socios de la pelicula
            for (Socios s : p.getSocios()) {

                // Mostramos nombre y precio abonado
                System.out.println("- " + s.getNombre() + " | Pago: " + s.getPrecioAbonado());
            }
        }
    }

    // Calcula el beneficio entero de una pelicula
    public static double beneficio(Peliculas p) {

        double total = 0;

        // Sumamos lo que ha pagado cada socio
        for (Socios s : p.getSocios()) {
            total += s.getPrecioAbonado();
        }

        // Restamos el coste de la licencia
        return total - p.getCosteLicencia();
    }

    // Película mas rentable
    public static void peliculaMasRentable(Peliculas[] peliculas) {

        // Suponemos que la primera es la mejor
        Peliculas mejor = peliculas[0];
        double mejorBeneficio = beneficio(mejor);

        // Recorremos todas las películas
        for (Peliculas p : peliculas) {

            // Calculamos el beneficio de la película actual
            double b = beneficio(p);

            // Si es mayor que el mejor encontrado, actualizamos
            if (b > mejorBeneficio) {
                mejor = p;
                mejorBeneficio = b;
            }
        }

        // Mostramos el resultado
        System.out.println("\nPelícula mas rentable: " + mejor.getTitulo());
        System.out.println("Beneficio: " + mejorBeneficio);
    }

    // Pelicula menos rentable
    public static void peliculaMenosRentable(Peliculas[] peliculas) {

        // Suponemos que la primera es la peor
        Peliculas peor = peliculas[0];
        double peorBeneficio = beneficio(peor);

        // Recorremos todas las peliculas
        for (Peliculas p : peliculas) {

            // Calculamos beneficio
            double b = beneficio(p);

            // Si es menor que el peor encontrado, actualizamos
            if (b < peorBeneficio) {
                peor = p;
                peorBeneficio = b;
            }
        }

        // Mostramos el resultado
        System.out.println("\nPelícula menos rentable: " + peor.getTitulo());
        System.out.println("Beneficio: " + peorBeneficio);
    }

    // Buscar película por nombre
    public static void buscarPelicula(Peliculas[] peliculas, Scanner entrada) {

        System.out.print("Introduce el titulo a buscar: ");
        String titulo = entrada.nextLine();

        // Recorremos todas las peliculas
        for (Peliculas p : peliculas) {

            if (p.getTitulo().equalsIgnoreCase(titulo)) {

                // Si coincide mostramos la informacion
                System.out.println("\nPelicula encontrada: " + p.getTitulo());
                System.out.println("Beneficio neto: " + beneficio(p));
                System.out.println("Socios asistentes:");

                // Mostramos los socios
                for (Socios s : p.getSocios()) {
                    System.out.println("- " + s.getNombre() + " | Pago: " + s.getPrecioAbonado());
                }
                return; // Salimos del método
            }
        }

        // Si no se encontro ninguna pelicula
        System.out.println("No existe una pelicula con ese titulo.");
    }

    // Contar socios que han pagado mas dinero
    public static void contarSociosQuePagaronMas(Peliculas[] peliculas, Scanner entrada) {

        System.out.print("Introduce la cantidad mínima: ");
        double cantidad = entrada.nextDouble();

        int contador = 0;

        // Recorremos todas las películas
        for (Peliculas p : peliculas) {

            // Recorremos los 4 socios de cada película
            for (Socios s : p.getSocios()) {

                // Si el socio pago mas que la cantidad indicada, lo contamos
                if (s.getPrecioAbonado() > cantidad) {
                    contador++;
                }
            }
        }

        // Mostramos el total
        System.out.println("Número de socios que han pagado más de " + cantidad + ": " + contador);
    }
}