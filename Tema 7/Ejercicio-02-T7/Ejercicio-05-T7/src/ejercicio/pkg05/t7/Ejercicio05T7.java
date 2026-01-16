package ejercicio.pkg05.t7;

import java.util.Scanner;

public class Ejercicio05T7 {

    private static final int FILA = 4;
    private static final int COL = 2;

    public static void main(String[] args) {
        int[][] matriz = new int[FILA][COL];

        rellenarMatriz(matriz);
        mostrarMatriz(matriz);

        int mayor = matrizMayor(matriz);
        int menor = matrizMenor(matriz);
        int suma = matrizSuma(matriz);

        System.out.println("Mayor valor: " + mayor);
        System.out.println("Menor valor: " + menor);
        System.out.println("Suma total: " + suma);
    }

    public static void rellenarMatriz(int matriz[][]) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Vamos a rellenar la matriz: ");

        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.print("Introduzca el valor [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        entrada.close();
    }

    public static int matrizMayor(int matriz[][]) {
        int mayor = Integer.MIN_VALUE;

        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COL; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }
        return mayor;
    }

    public static int matrizMenor(int matriz[][]) {
        int menor = Integer.MAX_VALUE;

        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COL; j++) {
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        return menor;
    }

    public static int matrizSuma(int matriz[][]) {
        int resultado = 0;

        for (int i = 0; i < FILA; i++) {
            for (int j = 0; j < COL; j++) {
                resultado += matriz[i][j];
            }
        }
        return resultado;
    }

    public static void mostrarMatriz(int matriz[][]) {
        System.out.println("\n--- MATRIZ 4x2 ---");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println();
    }
}

