package ejercicio.pkg10.t7;

public class Ejercicio10T7 {

    public static void main(String[] args) {
        int[] vector = new int[10]; // Creamos un array de 10

        rellenarVector(vector); // Lo rellenamos con números aleatorios entre 1 y 8

        // Mostramos el vector generado
        System.out.println("Se han generado los siguientes números:");
        mostrarVector(vector);

        // Sustituimos los valores repetidos por 0
        sustituirRepetidos(vector);

        // Mostramos el vector modificado
        System.out.println("Sustituimos los elementos repetidos por un 0:");
        mostrarVector(vector);
    }

    // Método que rellena el vector con números aleatorios del 1 al 8
    public static void rellenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 8) + 1; // 1 a 8
        }
    }

    // Método que muestra el vector
    public static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

    // Método que sustituye los valores repetidos por 0
    public static void sustituirRepetidos(int[] vector) {
        for (int i = 0; i < vector.length; i++) { // El primer for toma un número
            for (int j = i + 1; j < vector.length; j++) { // Compara con los de la derecha
                if (vector[i] == vector[j]) { // Si encuentra repetido, lo cambia a 0
                    vector[j] = 0;
                }
            }
        }
    }
}