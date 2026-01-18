/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg06.t7;

/**
 *
 * @author alumno
 */
public class Ejercicio06T7 {
    
 public class Ejercicio06 {

    public static void main(String[] args) {

        int[] primos = new int[80];
        int contador = 0;
        int num = 1;

        while (contador < 80) {

            boolean divisible = false;
            int i = 2;

            // Comprobación de primo con tu estructura
            while (i < num / 2 && !divisible) {
                if (num % i == 0) {
                    divisible = true;
                }
                i++;
            }

            // Si NO es divisible y es mayor que 1 → primo
            if (!divisible && num > 1) {
                primos[contador] = num;
                contador++;
            }

            num++;
        }

        // Mostrar el array
        for (int j = 0; j < primos.length; j++) {
            System.out.println("[" + j + "] → " + primos[j]);
        }
    }
}


    
  /*  public static void main(String[] args) {
        int[] primos = new int[80];
        int contador = 0;
        int numero = 2;
        
        while (contador < 80) {
            if (esPrimo (numero)) {
                primos[contador] = numero;
                contador++;
            }
            numero++;
        }
        
        System.out.println("Los 80 primeros numeros primos son: ");
        for (int p : primos) {
            System.out.println(p + " ");
        }
    }
    
    public static boolean esPrimo (int n) {
        if (n < 2) return false;
        
        for (int i = 2 ; i <= Math.sqrt(n) ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    */
    /*

    public static void main(String[] args) {

        int[] primos = new int[80];
        int contador = 0;
        int numero = 2;

        while (contador < 80) {

            boolean esPrimo = true;

            // Comprobamos si es divisible por algún primo anterior
            for (int i = 0; i < contador; i++) {
                if (numero % primos[i] == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                primos[contador] = numero;
                contador++;
            }

            numero++;
        }

        // Mostrar los 80 primeros números primos
        for (int p : primos) {
            System.out.print(p + " ");
        }
    }
    */
}
