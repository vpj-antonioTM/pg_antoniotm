package ejercicio.pkg19;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Declaramos el arreglo de empleados con tamaño 3
        Empleado[] empleados = new Empleado[3];
        
        // Bucle for para pedir los datos de los empleados
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("\nIngrese los datos del empleado " + (i+1) + ":");

            System.out.print("Nombre: ");
            String nombre = entrada.nextLine();

            System.out.print("Horas trabajadas: ");
            int horas = entrada.nextInt();

            System.out.print("Tarifa por hora: ");
            float tarifa = entrada.nextFloat();

            entrada.nextLine();

            // Guardamos el objeto en el arreglo
            empleados[i] = new Empleado(nombre, horas, tarifa);
        }

        // Mostrar resultados
        System.out.println("\n--- Totales a recibir ---");
        for (int i = 0; i < empleados.length; i++) {
            empleados[i].informacion();
        }
    }
}
