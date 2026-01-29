/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg07.t8;

import java.util.Random;
import java.util.Scanner;

public class TemperaturasMes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Array de días del mes
        Dia[] mes = new Dia[30];

        // Array con los nombres de los días de la semana
        String[] semana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        int opcion;

        do {
            System.out.println("\n--- MENÚ TEMPERATURAS ---");
            System.out.println("1. Rellenar temperaturas aleatoriamente");
            System.out.println("2. Mostrar temperatura media del mes");
            System.out.println("3. Mostrar todas las temperaturas");
            System.out.println("4. Día o días más calurosos");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("\nRellenando temperaturas...");

                    int inicio = rand.nextInt(7); // Día aleatorio de la semana para el día 1

                    for (int i = 0; i < mes.length; i++) {
                        String nombreDia = semana[(inicio + i) % 7];
                        int temperatura = rand.nextInt(21) + 20; // entre 20 y 40 grados
                        mes[i] = new Dia(nombreDia, i + 1, temperatura);
                    }

                    System.out.println("Temperaturas generadas correctamente.");
                    break;

                case 2:
                    double suma = 0;
                    for (Dia d : mes) {
                        if (d != null) suma += d.getTemperatura();
                    }
                    double media = suma / mes.length;
                    System.out.println("\nTemperatura media del mes: " + media + " grados");
                    break;

                case 3:
                    System.out.println("\n--- TEMPERATURAS DEL MES ---");
                    for (Dia d : mes) {
                        if (d != null) {
                            System.out.println(d.getNombreDia() + " día " + d.getNumeroDia() +
                                    ": " + d.getTemperatura() + " grados");
                        }
                    }
                    break;

                case 4:
                    int max = Integer.MIN_VALUE;

                    // Encontrar temperatura máxima
                    for (Dia d : mes) {
                        if (d != null && d.getTemperatura() > max) {
                            max = d.getTemperatura();
                        }
                    }

                    System.out.println("\nDía(s) más caluroso(s):");
                    for (Dia d : mes) {
                        if (d != null && d.getTemperatura() == max) {
                            System.out.println("• El " + d.getNombreDia() + " día " +
                                    d.getNumeroDia() + " con " + d.getTemperatura() + " grados.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}