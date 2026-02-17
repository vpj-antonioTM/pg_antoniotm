/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg09.t9;

import java.util.Scanner;

/**
 *
 * @author antonio
 */
public class Ejercicio09T9 {

    public static void main(String[] args) {

        // Creamos un objeto Scanner para leer datos del usuario
        Scanner entrada = new Scanner(System.in);

        // Pedimos el nombre de usuario
        System.out.print("Introduce tu nombre de usuario: ");
        String usuario = entrada.nextLine();

        // Pedimos la contraseña
        System.out.print("Introduce tu contraseña: ");
        String password = entrada.nextLine();

        // Variable que indica si la contraseña es valida
        boolean valida = true;

        // Comprobar que la contraseña tiene al menos 6 caracteres
        if (password.length() < 6) {
            System.out.println("Error la contraseña debe tener al menos 6 caracteres");
            valida = false;
        }

        // Comprobar que contiene al menos dos dígitos
        int contadorDigitos = 0;

        // Recorremos la contraseña carácter por carácter
        for (int i = 0; i < password.length(); i++) {

            // Character.isDigit() devuelve true si el caracter es un numero
            if (Character.isDigit(password.charAt(i))) {
                contadorDigitos++;
            }
        }

        if (contadorDigitos < 2) {
            System.out.println("Error la contraseña debe contener al menos dos dígitos");
            valida = false;
        }

        // Comprobar que el nombre de usuario NO aparece en la contraseña
        // Convertimos ambas cadenas a minusculas para evitar problemas de mayusculas/minusculas
        if (password.toLowerCase().contains(usuario.toLowerCase())) {
            System.out.println("Erro la contraseña no puede contener el nombre de usuario");
            valida = false;
        }

        // Resultado final
        if (valida) {
            System.out.println("La contraseña es valida");
        } else {
            System.out.println("La contraseña no es valida");
        }
    }
}

