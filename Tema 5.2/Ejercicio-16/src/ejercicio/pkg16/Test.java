package ejercicio.pkg16;

import java.util.Scanner;

// Clase Alumno
class Alumno {
    private final String nombre;
    private final int nota;

    // Constructor
    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    public int getNota() {
        return nota;
    }

    // Método para comprobar si la nota es válida
    public boolean notaValida() {
        return nota >= 0 && nota <= 10;
    }

    // Método para obtener la calificación
    public String obtenerCalificacion() {
        if (!notaValida()) {
            return "ERROR: La nota debe estar entre 0 y 10.";
        } else if (nota >= 0 && nota <= 4) {
            return "Suspenso";
        } else if (nota >= 5 && nota <= 6) {
            return "Bien";
        } else if (nota >= 7 && nota <= 8) {
            return "Notable";
        } else {
            return "Sobresaliente";
        }
    }

    // Método para mostrar los datos del alumno
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nota: " + nota);
        System.out.println("Calificacion: " + obtenerCalificacion());
        System.out.println("-------------------------");
    }
}

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
