package ejercicio.pkg20;

import java.util.Scanner;

    /**
     * @author Antonio
     * Ejercicio-20
     * @param args the command line arguments
     */
public class Ejercicio20 {
        //Constantes
        //static para que pertenezca a una clase y no a un objeto.
        //final para que no pueda cambiar el valor de Madrid
        //String para guardar una cadena de texto "Cólon"
        static final String capital = "Madrid";
        static final String america = "Colón";
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notaExamen = 0;

        System.out.println("EXAMEN CULTURA GENERAL");

        //Pregunta 1
        System.out.print("Pregunta 1 : ¿Cual es la capital de España?: ");
        String respuesta1 = sc.nextLine().trim();
        
        //Le decimos que la respuesta es true
        if (respuesta1.equalsIgnoreCase(capital)) {
            System.out.println("¡Muy bien, respuesta correcta!");
            notaExamen += 5;
            
        //Le decimos que la respuesta sea false
        } else {
            System.out.println("No es correcto. La respuesta correcta seria " + capital);
        }

        //Pregunta 2
        System.out.print("Pregunta 2 : ¿Quien descubrio America?: ");
        String respuesta2 = sc.nextLine().trim();
        
        //Le decimos que la respuesta es true
        if (respuesta2.equalsIgnoreCase(america)) {
            System.out.println("¡Muy bien, respuesta correcta!");
            notaExamen += 5;
            
        //Le decimos que la respuesta sea false
        } else {
            System.out.println("No es correcto. La respuesta correcta seria " + america);
        }

        // Mostrar nota final de 0 a 10
        System.out.println("NOTA DEL EXAMEN: " + notaExamen);

        sc.close();
    }
}