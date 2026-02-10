package ejercicio.pkg09.t8;

public class Asignatura {

    private String nombreAsignatura;
    private double nota;

    // Constructor por defecto
    public Asignatura(String lengua) {
        this.nombreAsignatura = "0";
        this.nota = 0;
    }

    // Constructor con parametros
    public Asignatura(String nombreAsignatura, double nota) {
        this.nombreAsignatura = nombreAsignatura;
        this.nota = nota;
    }

    // Getter and Setter
    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}