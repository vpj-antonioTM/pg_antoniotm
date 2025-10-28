package ejercicio.pkg01;

import java.util.Scanner;

public class Ejercicio01 {

    /**
     * @author Antonio
     * Ejercicio-01
     * @param numero
     * @return 
     */
public static String comprobarNumero(int numero) {
        if (numero > 0) {
            return "positivo";
        } else if (numero < 0) {
            return "negativo";
        } else {
            return "cero"; // caso adicional, por si el usuario introduce 0
        }
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduzca un numero: ");
        int numero = scanner.nextInt();

        // Llamada al método y obtención del resultado
        String resultado = comprobarNumero(numero);

        // Mostrar el resultado
        if (resultado.equals("cero")) {
            System.out.println("El numero introducido es cero.");
        } else {
            System.out.println("El numero introducido es " + resultado + ".");
        }

        scanner.close();
    }
}
