package cajafuerte;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class CajaFuerte {

    /**
     * @param args the command line arguments
     */

    public static void rellenarMonedas(Monedas[][] matriz, Scanner entrada) {
        // Este metodo rellena la matriz 3x3 con monedas introducidas por el usuario
        System.out.println("Rellene las monedas");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Moneda (" + i + ")(" + j + ")");

                System.out.print("De que material esta hecha: ");
                String material = entrada.nextLine();

                System.out.print("Que valor tiene: ");
                int valor = entrada.nextInt();
                entrada.nextLine();

                System.out.print("De que pais viene: ");
                String pais = entrada.nextLine();

                matriz[i][j] = new Monedas(valor, material, pais);
            }
        }
    }

public static void mostrarMonedaMaterial(Monedas[][] matriz) {

    // Pide al usuario el material a buscar
    Scanner entrada = new Scanner(System.in);
    System.out.print("Tipo de Material de la Moneda: ");
    String materialBuscado = entrada.nextLine();
    
    int i = 0, j = 0;
    boolean encontrado = false;

    //Busca el material con While + Boolean
    while (i < matriz.length && !encontrado) {
        j = 0;
        while (j < matriz[i].length && !encontrado) {

            // Va recorriendo la matriz a ver si encuentra el material
            if (matriz[i][j].getMaterial().equalsIgnoreCase(materialBuscado)) {
                encontrado = true; 
            } else {
                j++;
            }
        }
        if (!encontrado) {
            i++; 
        }
    }

    // Si encontro monedas con el mismo material muestra los datos
    if (encontrado) {
        System.out.println("Moneda encontrada en (" + i + ")(" + j + ")");
        System.out.println("Material: " + matriz[i][j].getMaterial());
        System.out.println("Valor: " + matriz[i][j].getValor());
        System.out.println("Pais: " + matriz[i][j].getPais());
    } else {
        // Si no manda un mensaje de error al usuario
        System.out.println("No existe ninguna moneda fabricada con el material: " + materialBuscado);
    }
}


    public static void monedaMayorValor(Monedas[][] matriz) {

        // Este metodo busca la moneda de mayor valor dentro de la matriz de 3x3
        int valorMayor = matriz[0][0].getValor();
        int FILA = 0;
        int COL = 0;
        int valorActual;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                valorActual = matriz[i][j].getValor();

                // Va comparando y si encuentra uno mayor lo coge y sigue comparando
                if (valorActual > valorMayor) {
                    valorMayor = valorActual;
                    FILA = i;
                    COL = j;
                }
            }
        }

        // Muestra el resultado final
        System.out.println("La moneda de mayor valor es " + valorMayor
                + " y se encuentra en la posicion" + " ( " + FILA + " ) " + " ( " + COL + " ) ");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Monedas[][] matrizde9 = new Monedas[3][3]; // Matriz 3x3 para almacenar monedas
        int opcion;

        do {
            System.out.println("Menu de Opciones Caja Fuerte");
            System.out.println("1. Rellenar Monedas");
            System.out.println("2. Mostrar Material");
            System.out.println("3. Mostrar Moneda de Mayor Valor");
            System.out.println("4. Salir del programa");

            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    rellenarMonedas(matrizde9, entrada);
                    break;
                case 2:
                    mostrarMonedaMaterial(matrizde9);
                    break;
                case 3:
                    monedaMayorValor(matrizde9);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (opcion != 4);
    }
}
