package ejercicio.pkg16;

import java.util.Scanner;

// Clase Test
public class Test {
    
    // Método para pedir datos al usuario y crear un Alumno
    public static Alumno crearAlumnoDesdeEntrada() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el nombre del alumno: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce la nota del alumno (0-10): ");
        int nota = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        return new Alumno(nombre, nota);
    }

    public static void main(String[] args) {
        // Creamos 3 alumnos pidiendo datos al usuario
        Alumno a1 = crearAlumnoDesdeEntrada();
        Alumno a2 = crearAlumnoDesdeEntrada();
        Alumno a3 = crearAlumnoDesdeEntrada();

        // Mostramos resultados
        System.out.println("\n--- RESULTADOS ---");
        a1.mostrarDatos();
        a2.mostrarDatos();
        a3.mostrarDatos();
    }
}
