package ejercicio.pkg03;

/**
 * Ejercicio-03
 * @author antonio
 */
public class Comprobador {
    
    public static void imprimirMayor(int a, int b, int c) {
        int mayor;
        
        if (a >= b && a >=c){
            mayor = a;
        }
        else if (b>= a && b >= c){
            mayor = b;
        }
        else{
            mayor = c;
        }
        System.out.println("El numero mayor de los introducidos es el " + mayor);
    }
}
