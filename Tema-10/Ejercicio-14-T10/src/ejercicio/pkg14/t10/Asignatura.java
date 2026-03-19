package ejercicio.pkg14.t10;

public class Asignatura {
    String nombreAsignatura;
    float nota;

    public Asignatura(String nombreAsignatura, float nota) {
        this.nombreAsignatura = nombreAsignatura;
        this.nota = nota;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public float getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return nombreAsignatura + ": " + nota;
    }
}
