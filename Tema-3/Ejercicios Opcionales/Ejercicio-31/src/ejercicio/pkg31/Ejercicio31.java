package ejercicio.pkg31;
public class Ejercicio31 {

    /**
     * @author Antonio
     * Ejercico-31
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           /*int contador = 1;
           int aleatorio = (int) (Math.random()* 100) + 1;
                while (contador <= 3) {
                    if (aleatorio % 2 == 1){
                        System.out.println(aleatorio);
                    }
                    contador++;
                }
    }
}
*/
           int contadorImpares = 0;   // Contador de impares encontrados
        int totalGenerados = 0;    // Contador de números generados
        int num1 = 0, num2 = 0, num3 = 0; // Variables para guardar los 3 impares

        while (contadorImpares < 3) {
            int aleatorio = (int) (Math.random() * 100) + 1; // Genera entre 1 y 100
            totalGenerados++;

            if (aleatorio % 2 != 0) { // Si es impar
                contadorImpares++;
                if (contadorImpares == 1) {
                    num1 = aleatorio;
                } else if (contadorImpares == 2) {
                    num2 = aleatorio;
                } else if (contadorImpares == 3) {
                    num3 = aleatorio;
                }
            }
        }

        System.out.println("Los tres números impares generados son: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("Cantidad total de números generados: " + totalGenerados);
    }
}