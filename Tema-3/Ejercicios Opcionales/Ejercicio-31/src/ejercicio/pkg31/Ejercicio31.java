package ejercicio.pkg31;
public class Ejercicio31 {

    /**
     * @author Antonio
     * Ejercico-31
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Añado las variables cada una tiene una funcion
        int contadorImpar = 0;   // Contador de impares encontrados
        int totales = 0;    // Contador de numeros generados
        int num1 = 0, num2 = 0, num3 = 0; // Para guardas los numeros impares

        while (contadorImpar < 3) {
            
            //Generador de numero aleatorio
            int aleatorio = (int)(Math.random() * 100);
            totales++;
            
           //Hacemos que divida entre 2 y si el resto es igual a 1 es un numero impar
            if (aleatorio % 2 == 1) { 
                //Lo siguiente lo que hace es recoger los 3 numeros impares
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
        //Imprimo por pantalla el resultado
        System.out.println("Los tres numeros impares generados son: " + num1 + ", " + num2 + ", " + num3);
        System.out.println("Cantidad total de numeros generados: " + totales);
    }
}