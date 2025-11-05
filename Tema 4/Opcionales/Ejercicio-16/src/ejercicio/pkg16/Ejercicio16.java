package ejercicio.pkg16;
public class Ejercicio16 {

    /**
     * @author Antonio
     * Ejercicio-16
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Raiz cuadrada de 64: " + raizCuadrada());
        System.out.println("8 elevado al cubo: " + potencia());
        System.out.println("Exponencial de 2: " + exponencial());
        System.out.println("Logaritmo de 2.71828: " + logaritmo());
        System.out.println("Menor valor entre 2 y 3: " + menor());
        System.out.println("Valor absoluto de -4.5: " + valorAbsoluto());
        System.out.println("Redondeando -4.5 con ROUND: " + redondear());
        System.out.println("Seno de 45 grados: " + seno());
    }

    // Raiz cuadrada de 64
    public static double raizCuadrada() {
        return Math.sqrt(64);
    }

    // 8 elevado al cubo
    public static double potencia() {
        return Math.pow(8, 3);
    }

    // Exponencial de 2
    public static double exponencial() {
        return Math.exp(2);
    }

    // Logaritmo de 2.71828
    public static double logaritmo() {
        return Math.log(2.71828);
    }

    // Menor valor entre 2 y 3
    public static double menor() {
        return Math.min(2, 3);
    }

    // Valor absoluto de -4.5
    public static double valorAbsoluto() {
        return Math.abs(-4.5);
    }

    // Redondear -4.5 con ROUND
    public static long redondear() {
        return Math.round(-4.5);
    }

    // Seno de 45 grados
    public static double seno() {
        return Math.sin(Math.toRadians(45));
    }
    
}
