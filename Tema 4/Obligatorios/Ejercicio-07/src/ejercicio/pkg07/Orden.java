package ejercicio.pkg07;

/**
 * Ejercicio-07
 * @author antonio
 */
public class Orden {
    public static void imprimirOrden (int a, int b, int c, int d){
        int i = 0; // contador de ciclos

        // Se necesitan 3 ciclos para ordenar 4 números
        while (i < 3) {
            // Comparo a y b
            if (a > b) {
                a = a + b;
                b = a - b;
                a = a - b;
            }

            // Comparo b y c
            if (b > c) {
                b = b + c;
                c = b - c;
                b = b - c;
            }

            // Comparo c y d
            if (c > d) {
                c = c + d;
                d = c - d;
                c = c - d;
            }

            i++; // siguiente ciclo
        }

        System.out.println("El orden de los números introducidos es el " + a + " - " + b + " - " + c + " - " + d);
    }
}
