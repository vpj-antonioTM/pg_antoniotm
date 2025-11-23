package ejercicio.pkg16;

// Clase Alumno
class Alumno {

    private final String nombre;
    private final int nota;

    //Constructor por defecto
    public Alumno() {
        this.nombre = "0";
        this.nota = 0;
    }

    // Constructor
    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    //Getters
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
        System.out.println("\n");
    }
}
