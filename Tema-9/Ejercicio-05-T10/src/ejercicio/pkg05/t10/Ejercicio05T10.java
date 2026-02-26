/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg05.t10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author antonio
 */
public class Ejercicio05T10 {

    public class Ejercicio05 {

        public static void main(String[] args) {

            ArrayList<Integer> lista = new ArrayList<>();

            rellenarLista(lista);

            System.out.println("Lista original:");
            mostrarLista(lista);

            int mayorPar = obtenerMayorPar(lista);
            int menorImpar = obtenerMenorImpar(lista);

            System.out.println("Mayor numero par: " + mayorPar);
            System.out.println("Menor numero impar: " + menorImpar);

            intercambiarValores(lista, mayorPar, menorImpar);

            System.out.println("Lista despues del intercambio:");
            mostrarLista(lista);
        }

        // Metodo para rellenar la lista
        public static void rellenarLista(ArrayList<Integer> lista) {
            Scanner entrada = new Scanner(System.in);
            int numero;

            System.out.println("Introduce numeros enteros (negativo para terminar):");

            do {
                numero = entrada.nextInt();
                if (numero >= 0) {
                    lista.add(numero);
                }
            } while (numero >= 0);
        }

        // Metodo para mostrar la lista
        public static void mostrarLista(ArrayList<Integer> lista) {
            for (int i = 0; i < lista.size(); i++) {
                System.out.print(lista.get(i));
                if (i < lista.size() - 1) {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }

        // Metodo para obtener el mayor numero par
        public static int obtenerMayorPar(ArrayList<Integer> lista) {
            int mayor = Integer.MIN_VALUE;

            for (int n : lista) {
                if (n % 2 == 0 && n > mayor) {
                    mayor = n;
                }
            }
            return mayor;
        }

        // Metodo para obtener el menor numero impar
        public static int obtenerMenorImpar(ArrayList<Integer> lista) {
            int menor = Integer.MAX_VALUE;

            for (int n : lista) {
                if (n % 2 != 0 && n < menor) {
                    menor = n;
                }
            }
            return menor;
        }

        // Metodo para intercambiar posiciones de dos valores
        public static void intercambiarValores(ArrayList<Integer> lista, int valor1, int valor2) {

            int pos1 = lista.indexOf(valor1);
            int pos2 = lista.indexOf(valor2);

            if (pos1 != -1 && pos2 != -1) {
                lista.set(pos1, valor2);
                lista.set(pos2, valor1);
            }
        }
    }
}
