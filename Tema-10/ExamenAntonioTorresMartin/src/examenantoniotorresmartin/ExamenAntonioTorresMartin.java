/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenantoniotorresmartin;

import java.util.ArrayList;
import java.util.Scanner;
import javax.xml.stream.util.EventReaderDelegate;

/**
 *
 * @author alumno
 */
public class ExamenAntonioTorresMartin {

    public static void main(String[] args) {
        ArrayList<Coche> listaCoches = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        int[] posicion = new int[9];
        int opcion;
        do {
            System.out.println("Menu Principal");
            System.out.println("1. Aparcar Coche: ");
            System.out.println("2. Mostrar plazas libres: ");
            System.out.println("3. Mostrar datos de los coches: ");
            System.out.println("4. Mostrar los titulares que contengan x: ");
            System.out.println("5. Buscar matricula: ");
            System.out.println("6. Mostrar plazas libres o ocupadas");
            System.out.println("Elige una opcion");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 ->
                    aparcarCoche(listaCoches, entrada);
                case 2 ->
                    mostrarPlazas(posicion, listaCoches);
                case 3 ->
                    mostrarDatos(listaCoches);
                case 4 ->
                    mostrarTitularesX(listaCoches, entrada);
                case 5 ->
                    mostrarMatricula(args);
                case 6 ->
                    mostrarPlazasMatriz(args);
                case 7 ->
                    System.out.println("Salir del programa");
                default ->
                    System.out.println("Opcion Invalida");
            }
        } while (opcion != 7);
    }

    public static void aparcarCoche(ArrayList<Coche> listaCoches, Scanner entrada) {
        int[] posicion = new int[9];
        int contador = 0;
        System.out.println("Para aparcar el coches tendras que elegir la posicion y despues rellenar los datos");

        for (int i = 0; i < posicion.length; i++) {
            System.out.println("Elige la posicion: ");
            posicion[9] = entrada.nextInt();
            for (Coche c : listaCoches) {
                System.out.println("Rellena el nombre del titular: ");
                c.nombreTitular = entrada.nextLine();

                System.out.println("Rellena la matricula del coche: ");
                c.matriculaCoche = entrada.nextLine();
            }
            contador++;
        }
    }

    public static void mostrarPlazas(int[] posicion, ArrayList<Coche> listaCoches) {

    }

    public static void mostrarDatos(ArrayList<Coche> listaCoches) {
        for (Coche c : listaCoches) {
            System.out.println("Datos de los coches aparados: "
                    + "\nTitular: " + c.nombreTitular
                    + "\n Matricula de su coche: " + c.matriculaCoche);
        }
    }

    public static void mostrarTitularesX(ArrayList<Coche> listaCoches, Scanner entrada) {
        for (Coche c : listaCoches) {
            if (c.nombreTitular.toLowerCase().contains("Lazaro")) {
                System.out.println("Titulares que contienen la palabra: " + c.nombreTitular);
            }

        }
    }

    public static void mostrarMatricula(String[] args) {

    }

    public static void mostrarPlazasMatriz(String[] args) {

    }
}
