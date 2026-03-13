/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15t10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejercicio15t10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Empresa> listaEmpresas = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("Menu Opciones");
            System.out.println("1. Añadir Empresa y Empleados: ");
            System.out.println("2. Mostrar Empresa y Empleados: ");
            System.out.println("3. Mostrar los empleados con la letra A: ");
            System.out.println("4. Mostrar todos los empleados ordenados por el sueldo: ");
            System.out.println("5. Slair");
            System.out.println("Elige una opcion");

            opcion = entrada.nextInt();
            System.out.println();
            entrada.next();
            switch (opcion) {
                case 1:

                    break;
                default:
                    throw new AssertionError();
            }
        } while (opcion != 5);
    }

    public static void añadirEmpresaEmpleado(ArrayList<Empresa> listaEmpresas, Scanner entrada) {
        System.out.println("Rellene el nombre de la empresa: ");
        String respuestaEmpresa = "si";

        for (Empresa e : listaEmpresas) {
            if (respuestaEmpresa.equalsIgnoreCase("si")) {
                System.out.println("Rellene el nombre de la empresa: ");
                String nombrEmpresa = entrada.nextLine();

                Empresa nuevaEmpresa = new Empresa(nombrEmpresa);

                String respuestaEmpleados = "si";

                for (Empleados a : e.listaEmpleados) {
                    if (respuestaEmpleados.equalsIgnoreCase("si")) {
                        System.out.println("Rellena el nombre del empleado: ");
                        String nombreEmpleado = entrada.nextLine();

                        System.out.println("Rellene el sueldo: ");
                        int sueldo = entrada.nextInt();
                        entrada.nextLine();

                        nuevaEmpresa.addEmpleado(new Empleados(nombreEmpleado, sueldo));

                        System.out.println("Desea añadir algun empleado mas si o no");
                        respuestaEmpleados = entrada.nextLine();
                    }
                }
            }
            System.out.println("Desea añadir mas empresas a la lista si o no");
            respuestaEmpresa = entrada.nextLine();

            listaEmpresas.add(e);

        }
    }
    
    public static void mostrarEmpresaEmpleados(ArrayList<Empresa> listaEmpresas) {
        
    }
}
