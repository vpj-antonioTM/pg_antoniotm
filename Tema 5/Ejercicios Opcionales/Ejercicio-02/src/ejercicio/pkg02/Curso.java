package ejercicio.pkg02;

/**
 *
 * @author antonio
 */
public class Curso {
    //Atributos privaods para almacenar nombre y numero de horas
    private String nombre;
    private int numeroHoras;

    //Atributo privado estatico para almacenar contador de numero de cursos
    private static int numeroDeCursos = 0;

    //Constructo para llamar a sumarcursos, para que cada vez qeu se use sume 1
    public Curso() {
        sumarCursos();
    }

    //Metodo para darle nombre y horas al objeto
    public void establecerNombreyHoras(String nuevoNombre, int horas) {
        nombre = nuevoNombre;
        numeroHoras = horas;
    }

    //Metodo para obtener el nombre
    public String obtenerNombre() {
        return nombre;
    }

    //Metodo para obtener las horas
    public int obtenerHoras() {
        return numeroHoras;
    }

    //Metodo para sumar 1 en cursos
    public static void sumarCursos() {
        numeroDeCursos++;
    }

    //Metodo para obtener el numero de cursos
    public static int verNumeroCursos() {
        return numeroDeCursos;
    }
}