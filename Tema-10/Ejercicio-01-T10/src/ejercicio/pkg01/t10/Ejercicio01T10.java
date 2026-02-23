package ejercicio.pkg01.t10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio01T10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> listaNombres = new ArrayList<>();
        
        rellenarLista(listaNombres);
        mostrarLista(listaNombres);
    }
    
    public static void rellenarLista (ArrayList<String> lista) {
        Scanner entrada = new Scanner (System.in);
        String respuesta;
        
        do {
            System.out.println("Introduce un nombre: ");
            String nombre = entrada.nextLine();
            lista.add(nombre);
            
            System.out.println("Quieres introducir otro nombre si o no: ");
            respuesta = entrada.nextLine().toLowerCase();
        }
        while (respuesta.equals("si"));
    }
    
    public static void mostrarLista (ArrayList<String> lista){
        System.out.println("Lista de nombres");
            for (String nombre : lista) {
                System.out.println(" - " + nombre);
            }
    }
    
}
