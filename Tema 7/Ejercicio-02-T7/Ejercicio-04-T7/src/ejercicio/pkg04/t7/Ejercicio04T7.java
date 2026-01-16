/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg04.t7;

/**
 *
 * @author alumno
 */
public class Ejercicio04T7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[4][3];
        rellenarMatriz(matriz);
        mostrarMatriz(matriz);
    }

    public static void rellenarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                                matriz[i][j] = (int) (Math.random() * 101) + 100;
            }
        }
    }

    public static void mostrarMatriz(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                if (matriz[i][j] % 2 == 0) {
                System.out.println(" [" + i + j + " ]  --> " + matriz[i][j]);
            }
            System.out.println("\n");
            }
        }
    }
}
