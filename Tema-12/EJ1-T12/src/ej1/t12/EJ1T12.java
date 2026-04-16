/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1.t12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa que gestiona una agenda telefónica usando listas.
 * Se capturan todas las excepciones posibles y se usa la cláusula throws
 * en los métodos que pueden generar errores.
 * 
 * @author alumno
 */
public class EJ1T12 {

    // Lista donde guardaremos los contactos
    static ArrayList<Contacto> agenda = new ArrayList<>();

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        // Bucle principal del menú
        do {
            System.out.println("Menu del programa");
            System.out.println("1. Añadir contactos a la agenda");
            System.out.println("2. Visualizar la lista de contactos");
            System.out.println("3. Eliminar contactos de la lista");
            System.out.println("4. Mostrar contactos ordenados por edad");
            System.out.println("5. Salir del programa");
            System.out.print("Elige una opcion: ");

            try {
                opcion = entrada.nextInt();
                entrada.nextLine(); 

                switch (opcion) {
                    case 1 -> añadirContactos();
                    case 2 -> visualizarContactos();
                    case 3 -> eliminarContactos();
                    case 4 -> mostrarContactosOrdenados();
                    case 5 -> System.out.println("Saliendo del programa");
                    default -> System.out.println("Opcion no valida");
                }

            } catch (InputMismatchException e) {
                // Captura si el usuario escribe letras en vez de números
                System.out.println("Error debes introducir un numero.");
                entrada.nextLine(); // Limpia el error del scanner
                opcion = 0; // Para que el menú continúe
            }

        } while (opcion != 5);
    }

    /**
     * Método para añadir contactos a la agenda.
     * Captura excepciones por datos incorrectos.
     */
    public static void añadirContactos() {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Introduce el nombre: ");
            String nombre = entrada.nextLine();

            System.out.print("Introduce la edad: ");
            int edad = entrada.nextInt();
            entrada.nextLine();

            System.out.print("Introduce el numero de movil: ");
            String telefono = entrada.nextLine();

            // Creamos el contacto y lo añadimos a la lista
            agenda.add(new Contacto(nombre, edad, telefono));

            System.out.println("Contacto aniadido correctamente.");

        } catch (InputMismatchException e) {
            System.out.println("Error la edad debe ser un numero entero.");
        } catch (Exception e) {
            System.out.println("Error inesperado al aniadir contacto.");
        }
    }

    /**
     * Muestra todos los contactos de la agenda.
     */
    public static void visualizarContactos() {
        if (agenda.isEmpty()) {
            System.out.println("La agenda esta vacia.");
        } else {
            System.out.println("Lista de contactos\n");
            for (Contacto c : agenda) {
                System.out.println(c);
            }
        }
    }

    /**
     * Elimina un contacto buscando por número de teléfono.
     */
    public static void eliminarContactos() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el numero de telefono del contacto a eliminar: ");
        String telefono = entrada.nextLine();

        boolean encontrado = false;

        try {
            for (Contacto c : agenda) {
                if (c.getTelefono().equals(telefono)) {
                    agenda.remove(c);
                    System.out.println("Contacto eliminado correctamente.");
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("No existe ningun contacto con ese numero.");
            }

        } catch (Exception e) {
            System.out.println("Error al intentar eliminar el contacto.");
        }
    }

    /**
     * Muestra los contactos ordenados por edad.
     */
    public static void mostrarContactosOrdenados() {
        if (agenda.isEmpty()) {
            System.out.println("La agenda esta vacia.");
            return;
        }

        // Ordenamos usando un Comparator por edad
        Collections.sort(agenda, Comparator.comparingInt(Contacto::getEdad));

        System.out.println("Contactos ordenados por edad\n");
        for (Contacto c : agenda) {
            System.out.println(c);
        }
    }
}