package ejercicio.pkg26;
public class Ejercicio26 {

    /**
     * @author Antonio
     * Ejercicio-26
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int suma = 0;

        for (int i = 111; i <= 222; i++) {
            if (i % 2 == 1) {
                suma += i;
            }
        }

        System.out.println("La suma de los numeros impares entre 111 y 222 es: " + suma);
    }
    
}
