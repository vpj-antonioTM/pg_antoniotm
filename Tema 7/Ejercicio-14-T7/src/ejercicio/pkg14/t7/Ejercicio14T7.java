package ejercicio.pkg14.t7;

import java.util.Scanner;

public class Ejercicio14T7 {

    private static final int semana = 4;
    private static final int dia = 7;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] temperaturas = new int[4][7];
        String[] diasemana = {
            "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"
        };

        int opcion;

        do {
            System.out.println("\nMenu de Acciones");
            System.out.println("1. Rellenar temperaturas");
            System.out.println("2. Mostrar temperaturas");
            System.out.println("3. Temperatura media del mes");
            System.out.println("4. Dia o dias mas calurosos");
            System.out.println("5. Salir");

            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    for (int i = 0; i < semana; i++) {
                        System.out.println("Semana " + (i + 1) + ":");
                        for (int j = 0; j < dia; j++) {
                            System.out.print("  " + diasemana[j] + ": ");
                            temperaturas[i][j] = entrada.nextInt();
                        }
                    }
                    break;

                case 2:
                    System.out.println("\nTemperaturas registradas:");
                    for (int i = 0; i < semana; i++) {
                        System.out.println("\nSemana " + (i + 1) + ":");
                        for (int j = 0; j < dia; j++) {
                            System.out.println("  " + diasemana[j] + ": " + temperaturas[i][j] + " grados");
                        }
                    }
                    break;

                case 3:
                    int suma = 0;
                    for (int i = 0; i < semana; i++) {
                        for (int j = 0; j < dia; j++) {
                            suma += temperaturas[i][j];
                        }
                    }
                    double media = suma / 28.0;
                    System.out.println("\nLa temperatura media del mes es: " + media);
                    break;

                case 4:
                    int max = temperaturas[0][0];

                    for (int i = 0; i < semana; i++) {
                        for (int j = 0; j < dia; j++) {
                            if (temperaturas[i][j] > max) {
                                max = temperaturas[i][j];
                            }
                        }
                    }

                    System.out.println("\nLos dias mas calurosos fueron:");
                    for (int i = 0; i < semana; i++) {
                        for (int j = 0; j < dia; j++) {
                            if (temperaturas[i][j] == max) {
                                System.out.println("El " + diasemana[j] + " de la semana " + (i + 1) + " con " + max + " grados.");
                            }
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del menu...");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 5);
    }
}

