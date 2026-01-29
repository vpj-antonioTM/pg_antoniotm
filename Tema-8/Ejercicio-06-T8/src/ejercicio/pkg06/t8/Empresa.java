/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg06.t8;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
class Empleado {
    private String nombre;
    private int horasTrabajadas;
    private double tarifaHora;

    public Empleado() {
        this.nombre = "0";
        this.horasTrabajadas = 0;
        this.tarifaHora = 0;
    }

    public Empleado(String nombre, int horasTrabajadas, double tarifaHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }
    
    public double calcularSueldoBruto () {
        if (horasTrabajadas <= 40) {
            return horasTrabajadas * tarifaHora;
        }
        else {
            int horasNormales = 40;
            int horasExtra = horasTrabajadas - 40;
            return (horasNormales * tarifaHora) + (horasExtra * tarifaHora * 1.5);
        }
    }
    
    public void mostrarDatos() {
        System.out.println(nombre + " trabajo " + horasTrabajadas + " horas, cobra " +
                tarifaHora + " euros la hora. por lo que ha cobrado " + calcularSueldoBruto() + " euros"
                );
    }
}   
public class Empresa { 
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Cuantos empleados deseas introducir: ");
        int numEmpleados = entrada.nextInt();
        entrada.nextLine();
        
        Empleado[] empleados = new Empleado[numEmpleados];
        
        for (int i = 0; i < numEmpleados ; i++) {
            System.out.println("Empleado " + (i + 1));
            
            System.out.println("Nombre");
            String nombre = entrada.nextLine();
            
            System.out.println("Horas trabajadas");
            int horas = entrada.nextInt();
            
            System.out.println("Tarifa");
            double tarifa = entrada.nextDouble();
            entrada.nextLine();
            
            empleados[i] = new Empleado(nombre, horas, tarifa);
        }
        
        System.out.println("\n Sueldos Brutos");
        
        for (Empleado emp : empleados) {
            emp.mostrarDatos();
        }
        
        entrada.close();
    }
}
