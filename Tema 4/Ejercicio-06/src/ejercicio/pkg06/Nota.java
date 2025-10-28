package ejercicio.pkg06;

/**
 * Ejercicio-06
 * @author antonio
 */
public class Nota {
    
    public static void imprimirNota(int a){
        if (a >= 0 && a <= 4){
            System.out.println("La nota es de " + a + " y es Suspenso");
        }
        else if (a >= 5 && a <= 6){
            System.out.println("La nota es de " + a + " y es Bien");
        }
        else if (a >= 7 && a <= 8) {
            System.out.println("La nota es de " + a + " y es Notable");
        }
        else if (a >= 9 && a <= 10) {
            System.out.println("La nota es de " + a + " y es Sobresaliente");
        }
        else {
            System.out.println("El numero introducido no es valido");
        }
    }
}
