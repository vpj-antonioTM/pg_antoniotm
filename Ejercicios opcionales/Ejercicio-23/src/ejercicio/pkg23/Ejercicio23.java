
package ejercicio.pkg23;

import java.util.Scanner;

public class Ejercicio23 {

    /**
     * @author Antonio
     * Ejercicio-23
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Aqui llamo a la clase Scanner para realizar el ejercicio
        Scanner datos = new Scanner (System.in);
        
        //Aqui pido que el usuario introduzca el precio del ordenador
        System.out.println("Por favor, introduzca el precio del modelo de ordenador que desea comprar: ");
        int precio = datos.nextInt();
        
        //Aqui pido que introduzca la cantidad
        System.out.println("¿Cuántas unidades quiere llevarse? ");
        int cantidad = datos.nextInt();
        
        //Aqui creo la operacion de precio * cantidad y hago que muestre el resultado
        int total = precio * cantidad;
        System.out.println("El precio total de su comprar es de: " + total + "€");
    }
    
}
