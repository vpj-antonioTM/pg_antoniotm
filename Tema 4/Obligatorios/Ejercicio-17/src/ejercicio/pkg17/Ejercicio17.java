package ejercicio.pkg17;

import java.util.Scanner;

public class Ejercicio17 {

    public static void main(String[] args) {
        jugarAdivinarLetra();
    }

    // Subprograma que contiene la lógica del juego
    public static void jugarAdivinarLetra() {
        Scanner entrada = new Scanner(System.in);

        int M = 97; // 'a'
        int N = 122; // 'z'

        // Genera un numero aleatorio entre 97 y 122, y la letra correspondiente
        int numero = (int) (Math.floor(Math.random() * (N - M + 1) + M));
        char letraSecreta = (char) numero;

        char letraUsuario;
        int intentos = 0;

        System.out.println("JUEGO ADIVINAR LA LETRA");
        System.out.println("He elegido una letra minuscula entre 'a' y 'z'. Intenta adivinarla.");

        do {
            System.out.print("Introduce una letra: ");
            letraUsuario = entrada.nextLine().charAt(0);
            intentos++;

            if (letraUsuario < letraSecreta) {
                System.out.println("La letra secreta esta despues de " + letraUsuario + " en el alfabeto.");
            } else if (letraUsuario > letraSecreta) {
                System.out.println("La letra secreta esta antes de " + letraUsuario + " en el alfabeto.");
            } else {
                System.out.println("Bien, has adivinado la letra '" + letraSecreta + "'.");
                System.out.println("Numero de intentos para adivinar la letra: " + intentos);
            }

        } while (letraUsuario != letraSecreta);

        entrada.close();
    }
}
