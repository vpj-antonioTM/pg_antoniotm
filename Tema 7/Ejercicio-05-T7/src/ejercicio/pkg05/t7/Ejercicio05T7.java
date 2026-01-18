package ejercicio.pkg05.t7;

import java.util.Scanner;

public class Ejercicio05T7 {

    private static final int FIL = 4;
    private static final int COL = 2;

    public static void rellenarMatriz(int[][] matriz) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce los valores de la matriz: ");

        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.print("Matriz seccion [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
    }

    public static void atractivoMatriz(int[][] matriz) {
        System.out.println("\nMatriz Introducida: ");

        for (int i = 0; i < FIL; i++) {
            System.out.print("| ");
            for (int j = 0; j < COL; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public static int mayorMatriz(int[][] matriz) {
        int mayor = matriz[0][0];

        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }
        return mayor;
    }

    public static int menorMatriz(int[][] matriz) {
        int menor = matriz[0][0];

        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        return menor;
    }

    public static int sumarMatriz(int[][] matriz) {
        int suma = 0;

        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int[][] matriz = new int[4][2];

        rellenarMatriz(matriz);
        atractivoMatriz(matriz);

        int mayor = mayorMatriz(matriz);
        int menor = menorMatriz(matriz);
        int suma = sumarMatriz(matriz);

        System.out.println("\nRESULTADOS");
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Suma: " + suma);
    }
}

