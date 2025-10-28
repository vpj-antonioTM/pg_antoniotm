package ejercicio.pkg04;

/**
 * Ejercicio-04
 * @author antonio
 */
public class Comprobador {
    public static void imprimirMenor(int a, int b, int c){
    
        int menor;
        
        if(a <= b && a <= c){
            menor = a;
        }
        else if (b <= a && b <= c){
            menor = b;
        }
        else {
            menor = c;
        }
        System.out.println("El numero menor es el " + menor);
    }
}