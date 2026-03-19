package ej16;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej16 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ArrayList<Producto> productos = new ArrayList<>();

        int opcion;

        do {
            System.out.println("Menu Principal");
            System.out.println("1. Menu de Administracion");
            System.out.println("2. Menu de Compra");
            System.out.println("3. Salir");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1 -> menuAdministracion(productos, entrada);
                case 2 -> menuCompra(productos, entrada);
                case 3 -> System.out.println("Saliendo...");
                default -> System.out.println("Opcion invalida");
            }

        } while (opcion != 3);
    }

    // ---------------- MENÚ ADMINISTRACIÓN ----------------

    public static void menuAdministracion(ArrayList<Producto> productos, Scanner entrada) {
        int opcion;

        do {
            System.out.println("Menu Administracion");
            System.out.println("1. Introducir producto");
            System.out.println("2. Visualizar productos");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Volver");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1 -> introducirProducto(productos, entrada);
                case 2 -> visualizarProductos(productos);
                case 3 -> eliminarProducto(productos, entrada);
                case 4 -> System.out.println("Volviendo...");
                default -> System.out.println("Opcion invalida");
            }
        } while (opcion != 4);
    }

    public static void introducirProducto(ArrayList<Producto> productos, Scanner entrada) {
        System.out.println("Nombre: ");
        String nombre = entrada.nextLine();

        System.out.println("Precio: ");
        float precio = entrada.nextFloat();

        System.out.println("Stock: ");
        int stock = entrada.nextInt();
        entrada.nextLine();

        productos.add(new Producto(nombre, precio, stock));
        System.out.println("Producto añadido.");
    }

    public static void visualizarProductos(ArrayList<Producto> productos) {
        System.out.println("Lista de productos:");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println((i + 1) + " - " + productos.get(i));
        }
    }

    public static void eliminarProducto(ArrayList<Producto> productos, Scanner entrada) {
        System.out.println("Nombre del producto a eliminar: ");
        String nombre = entrada.nextLine();

        boolean eliminado = false;

        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                productos.remove(i);
                eliminado = true;
                break;
            }
        }

        if (eliminado) {
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    // ---------------- MENÚ COMPRA ----------------

    public static void menuCompra(ArrayList<Producto> productos, Scanner entrada) {
        float total = 0;
        int opcion;

        do {
            System.out.println("Menu de Compra");
            System.out.println("1. Comprar producto");
            System.out.println("2. Volver");
            opcion = entrada.nextInt();
            entrada.nextLine();

            if (opcion == 1) {
                total += comprarProducto(productos, entrada);
            }

        } while (opcion != 2);

        if (total > 0) {
            System.out.println("Total de la compra: " + total);
        }
    }

    public static float comprarProducto(ArrayList<Producto> productos, Scanner entrada) {
        visualizarProductos(productos);

        System.out.println("Nombre del producto: ");
        String nombre = entrada.nextLine();

        Producto elegido = null;

        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getNombre().equalsIgnoreCase(nombre)) {
                elegido = productos.get(i);
                break; // ← IMPORTANTE
            }
        }

        if (elegido == null) {
            System.out.println("Producto no encontrado.");
            return 0;
        }

        System.out.println("Unidades a comprar: ");
        int unidades = entrada.nextInt();
        entrada.nextLine();

        if (unidades > elegido.getStock()) {
            System.out.println("Stock insuficiente. Solo quedan: " + elegido.getStock());
            return 0;
        }

        elegido.setStock(elegido.getStock() - unidades);
        float coste = unidades * elegido.getPrecio();
        System.out.println("Compra realizada. Coste: " + coste);

        return coste;
    }
}