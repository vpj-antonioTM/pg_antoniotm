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
        // Creo el Array donde se guardan los numeros introducidos
        ArrayList<Integer> listaNumeros = new ArrayList<>();

        // Introducimos los numeros y lo mostramos original
        rellenarLista(listaNumeros);
        mostrarLista(listaNumeros);

        // Se realiza la sustitucion por 0 y mostramos
        sustituirRepetidos(listaNumeros);
        mostrarLista(listaNumeros);
    }

    public static void rellenarLista(ArrayList<Integer> lista) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Introduce numeros positivos (un numero negativo para terminar):");

        // Bucle que pide numeros al usuario
        do {
            numero = entrada.nextInt();

            // Si el numero es positivo se guarda
            if (numero >= 0) {
                lista.add(numero);
            }

        } while (numero >= 0); // Si el numero es negativo se termina el bucle
    }

    public static void mostrarLista(ArrayList<Integer> lista) {
        System.out.println("Lista de numeros");

        for (int i = 0; i < lista.size(); i++) {

            // Se muestra los valores actuales
            System.out.print(lista.get(i));

            // Se coloca un guion entre los numeros menos en el ultimo
            if (i < lista.size() - 1) {
                System.out.print("-");
            }
        }
        // Salto de linea para que quede mas bonito
        System.out.println();
    }

    public static void sustituirRepetidos(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {

            // Coge los numeros con su valor actual
            int valor = lista.get(i);

            // Cuenta cuantas veces aparece cada numero
            int contador = 0;

            for (int j = 0; j < lista.size(); j++) {

                // Si coincide se suma 1 al contador
                if (lista.get(j) == valor) {
                    contador++;
                }
            }

            // Si aparece mas de una vez se sustituye por un 0
            if (contador > 1) {
                lista.set(i, 0);
            }
        }
    }
}
