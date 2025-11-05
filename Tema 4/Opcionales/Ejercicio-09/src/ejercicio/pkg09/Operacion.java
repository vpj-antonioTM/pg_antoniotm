package ejercicio.pkg09;

/**
 * Ejercicio-09
 * @author antonio
 */
public class Operacion {
    
    public static void numeroMenor(int a, int b, int c) {

        int menor = a;

        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }

        System.out.println("El menor de los tres numeros es: " + menor);
    }
}