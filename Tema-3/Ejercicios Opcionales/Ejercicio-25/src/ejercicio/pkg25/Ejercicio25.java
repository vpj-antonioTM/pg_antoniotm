package ejercicio.pkg25;
public class Ejercicio25 {

    /**
     * @author Antonio
     * Ejercicio-25
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 17; i <= 139; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }

        System.out.println("La suma de los numeros pares entre 17 y 139 es: " + suma);
    }
    
}
