package ejercicio.pkg04.t7;

import java.util.Random;

public class Ejercicio04T7 {

    private static final int FIL = 4;
    private static final int COL = 3;

    public static void main(String[] args) {

        int[][] matriz = new int[FIL][COL];

        rellenarMatriz(matriz);
        int[] pares = seleccionarPares(matriz);
        mostrarResultado(pares);
    }

    public static void rellenarMatriz(int[][] matriz) {
        Random numeros = new Random();

        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {
                matriz[i][j] = numeros.nextInt(101) + 100;
            }
        }
    }

    public static int[] seleccionarPares(int[][] matriz) {
        int contador = 0;

        // Contar pares
        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {
                if (matriz[i][j] % 2 == 0) {
                    contador++;
                }
            }
        }

        int[] pares = new int[contador];
        int total = 0;

        // Guardar pares
        for (int i = 0; i < FIL; i++) {
            for (int j = 0; j < COL; j++) {
                if (matriz[i][j] % 2 == 0) {
                    pares[total++] = matriz[i][j];
                }
            }
        }

        return pares;
    }

    public static void mostrarResultado(int[] pares) {
        System.out.println("Numeros pares encontrados:");

        for (int num : pares) {
            System.out.print(num + " ");
        }
    }
}

