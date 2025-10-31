package ejercicio.pkg12;

import java.util.Scanner;

public class Ejercicio12 {

    /**
     * @author Antonio
     * Ejercicio-12
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String passwordUsuario;
        final String PASSWORD_CORRECTA = "1234"; // Contraseña correcta que queremos

        int intentos = 0;
        boolean acceso = false;

        while (intentos < 3 && !acceso) {
            passwordUsuario = pedirPassword(sc);
            acceso = comprobarPassword(passwordUsuario, PASSWORD_CORRECTA);
            mostrarResultado(acceso);

            intentos++;

            if (!acceso && intentos < 3) {
                System.out.println("Intentos restantes: " + (3 - intentos));
            }
        }
        
        if (!acceso) {
            System.out.println("❌ Acceso denegado. Has superado los 3 intentos.");
        }
    }

    // Método para pedir contraseña
    public static String pedirPassword(Scanner sc) {
        System.out.print("Introduce la contraseña: ");
        return sc.nextLine();
    }

    // Método booleano para comprobar
    public static boolean comprobarPassword(String userPass, String correctPass) {
        return userPass.equals(correctPass);
    }

    // Método para mostrar el resultado
    public static void mostrarResultado(boolean correcto) {
        if (correcto) {
            System.out.println("✅ ¡Enhorabuena! Contraseña correcta.");
        } else {
            System.out.println("⚠ Contraseña incorrecta.");
        }
        
    }
    
}
