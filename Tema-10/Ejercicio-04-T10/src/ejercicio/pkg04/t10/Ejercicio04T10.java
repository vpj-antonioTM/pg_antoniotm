package ejercicio.pkg04.t10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio04T10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();

        rellenarLista(listaNumeros);
        mostrarLista(listaNumeros);
    }

    public static void rellenarLista(ArrayList<Integer> lista) {
        Scanner entrada = new Scanner(System.in);
        String respuesta;

        do {
            System.out.println("Introduce un numero del 1 al 9: ");
            int numero = entrada.nextInt();
            entrada.nextLine();
            lista.add(numero);

            System.out.println("Quieres introducir otro numero si o no: ");
            respuesta = entrada.nextLine().toLowerCase();
        } while (respuesta.equals("si"));
    }

    public static void mostrarLista(ArrayList<Integer> lista) {
        System.out.println("Lista de Numeros");

        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i));
            if (i < lista.size() - 1) {
                System.out.print("-");
            }
        }
        System.out.println();
    }
}
