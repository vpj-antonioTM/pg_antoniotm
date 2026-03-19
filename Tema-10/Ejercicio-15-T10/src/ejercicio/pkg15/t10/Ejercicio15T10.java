/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg15.t10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author antonio
 */
public class Ejercicio15T10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Empresa> listaEmpresas = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\nPulse 1 para introducir empresas y sus empleados.");
            System.out.println("Pulse 2 para mostrar empresas y sus empleados.");
            System.out.println("Pulse 3 para mostrar a todos los empleados cuyo nombre contenga la letra ‘A’");
            System.out.println("Pulse 4 para mostrar a todos los empleados ordenados por su sueldo");
            System.out.println("Pulse 5 para salir.");
            System.out.print("Elige una opción: ");

            opcion = entrada.nextInt();
            entrada.nextLine();
            
            switch (opcion) {
                case 1 -> añadirEmpresas(listaEmpresas, entrada);
                case 2 -> mostrarEmpresas(listaEmpresas);
                case 3 -> mostrarEmpleadosConA(listaEmpresas);
                case 4 -> mostrarEmpleadosOrdenados(listaEmpresas);
                case 5 -> System.out.println("Saliendo");
                default -> System.out.println("Opcion Invalida");
            }
        }
        while (opcion != 5);
    }
    
public static void añadirEmpresas(ArrayList<Empresa> listaEmpresas, Scanner entrada) {
    String respuestaEmpresa = "si";
    
    while (respuestaEmpresa.equalsIgnoreCase("si")) {            
        System.out.println("Nombre de la empresa: ");
        String nombreEmpresa = entrada.nextLine();
        
        Empresa emp = new Empresa(nombreEmpresa);
        
        String respuestaEmpleado = "si";
        int contador = 1;
        
        while (respuestaEmpleado.equalsIgnoreCase("si")) {                
            System.out.println("Nombre del empleado " + contador + ": ");
            String nombreEmpleado = entrada.nextLine();
            
            System.out.println("Sueldo del empleado " + contador + ": ");
            int sueldo = entrada.nextInt();
            entrada.nextLine();
            
            emp.listaEmpleados.add(new Empleado(nombreEmpleado,sueldo));
            contador++;
            
            System.out.println("¿Desea añadir más EMPLEADOS? (si/no)");
            respuestaEmpleado = entrada.nextLine();
        }
        
        listaEmpresas.add(emp);
        
        System.out.println("¿Desea añadir más EMPRESAS? (si/no)");
        respuestaEmpresa = entrada.nextLine();
    }
}

    
    public static void mostrarEmpresas(ArrayList<Empresa> listaemEmpresas) {
        for (Empresa e : listaemEmpresas) {
            System.out.println("\nEmpresa: " + e.nombreEmpresa);
            
            for (int i = 0; i < e.listaEmpleados.size(); i++) {
                Empleado emp = e.listaEmpleados.get(i);
                System.out.println("Empleado " + (i + 1) + ": " + emp.nombreEmpleado);
                System.out.println("Sueldo: " + emp.sueldo);
            }
        }
    }
    
    public static void mostrarEmpleadosConA(ArrayList<Empresa> listaEmpresas) {
        for (Empresa e : listaEmpresas) {
            for (Empleado emp : e.listaEmpleados) {
                if (emp.nombreEmpleado.toLowerCase().contains("a")) {
                    System.out.println(emp.nombreEmpleado + " - ");
                }
            }
        }
        System.out.println();
    }
    
    public static void mostrarEmpleadosOrdenados(ArrayList<Empresa> listaEmpresas) {
        ArrayList<Empleado> todos = new ArrayList<>();
        
        for (Empresa e : listaEmpresas) {
            for (Empleado emp : e.listaEmpleados) {
                todos.add(emp);
            }
        }
        
        for (int i = 0; i < todos.size(); i++) {
            for (int j = 0; j < todos.size(); j++) {
                if (todos.get(j).sueldo > todos.get(i).sueldo) {
                    Empleado aux = todos.get(i);
                    todos.set(i, todos.get(j));
                    todos.set(j, aux);
                }
            }
        }
        
        System.out.println("\nEmpleados ordenados por sueldo: ");
        for (Empleado emp : todos) {
            System.out.println(emp.nombreEmpleado + " - " + emp.sueldo);
        }
    }
    
}
