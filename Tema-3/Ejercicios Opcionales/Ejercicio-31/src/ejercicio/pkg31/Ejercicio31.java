package ejercicio.pkg31;
public class Ejercicio31 {

    /**
     * @author Antonio
     * Ejercico-31
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contadorImpar = 0;   // Contador de impares encontrados
        int totales = 0;    // Contador de números generados
        int num1 = 0, num2 = 0, num3 = 0; // Variables para guardar los 3 impares

        while (contadorImpar < 3) {
            int aleatorio = (int)(Math.random() * 100); // Genera entre 1 y 100
            totales++;

            if (aleatorio % 2 == 1) { // Si es impar
                contadorImpar++;
                if (contadorImpar == 1) {
                    num1 = aleatorio;
                } else if (contadorImpar == 2) {
                    num2 = aleatorio;
                } else if (contadorImpar == 3) {
                    num3 = aleatorio;
                }
            }
        }

        System.out.println("Los tres numeros impares generados son: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("Cantidad total de numeros generados: " + totales);
    }
}