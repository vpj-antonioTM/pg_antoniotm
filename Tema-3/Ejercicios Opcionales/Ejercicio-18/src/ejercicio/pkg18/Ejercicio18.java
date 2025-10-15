package ejercicio.pkg18;

import java.util.Scanner;

public class Ejercicio18 {

    /**
     * @author Antonio
     * Ejercicio-18
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String correcta = "PROG2025"; 
        String contrasena;
        int intentos = 0;
        final int intentosfallo = 3;

        do {
            System.out.print("Introduce la contraseña: ");
            contrasena = sc.nextLine();
            intentos++;

            if (contrasena.equals(correcta)) {
                System.out.println("¡Enhorabuena! Contraseña correcta.");
                break;
            } else {
                System.out.println("Contraseña incorrecta.");
            }

        } while (intentos < intentosfallo);

        if (!contrasena.equals(correcta)) {
            System.out.println("Error de acceso: has superado los 3 intentos.");
        }
    }
}
