package ejercicio.pkg14.t10;

import java.util.ArrayList;

public class Alumno {
    String nombreAlumno;
    ArrayList<Asignatura> asignaturas;

    public Alumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
        this.asignaturas = new ArrayList<>();
    }

    public float calcularMedia() {
        float suma = 0;
        for (Asignatura a : asignaturas) {
            suma += a.getNota();
        }
        return suma / asignaturas.size();
    }

    @Override
    public String toString() {
        return nombreAlumno + " - Media: " + calcularMedia();
    }
}
