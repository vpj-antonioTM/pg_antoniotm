/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg17.t7;

/**
 *
 * @author antonio
 */
public class Ejercicio17T7 {

    /**
     * @param args the command line arguments
     */
    public static int[] crearVector() {
        
        //Creo el vector de 10
        int[] vector = new int[10];
        
        //Rellenamos el vector con numeros aleatorios
        for (int i = 0 ; i < vector.length ; i++) {
            vector[i] = (int) (Math.random()*10);
        }
        return vector; //Devolvemos el resultado
    }
    
    public static void mostrarVector (int[] vector) {
        for (int i = 0 ; i < vector.length ; i++) {
            System.out.println(vector[i] + " ");//mostramos cada valor
        }
        System.out.println(); //Slato de linea para que quede mas colocado
    }
    
    public static void ordenarMayorAMenor (int[] vector) {
        
        //Creo un bucle para que haga metodo Burbuja
        for (int i = 0 ; i < vector.length ; i++) { //Lee todos los numeros del vector
            for (int j = 0 ; j < vector.length -1 ; j++) { //Compara los numeros
                if (vector[j] < vector [j + 1]) { //Si es menor que el siguiente lo intercambia
                    
                    //Intercambia los numeros usando el metodo burbuja
                    int vaso = vector[j];
                    vector[j] = vector [j + 1];
                    vector[j + 1] = vaso;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        //Creo el array numero que llama a crearVector
        int[] numeros = crearVector();
        
        //Mouestra el vector desordenado
        System.out.println("Vecotr desordenado");
        mostrarVector(numeros);
        
        //Ordena el vector de mayor a menor
        ordenarMayorAMenor(numeros);
        
        //Muestra el vector ordenado
        System.out.println("Vector ordenado");
        mostrarVector(numeros);
    }
    
}
