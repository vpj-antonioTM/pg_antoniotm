package ejercicio.pkg09.t8;

public class Alumno {

    // Nombre del alumno
    private String nombreAlumno;

    // Array de asignaturas del alumno
    private Asignatura[] notas;

    // Constructor que crea las 4 asignaturas por defecto
    public Alumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
        this.notas = new Asignatura[]{
            new Asignatura("Lengua"),
            new Asignatura("Mates"),
            new Asignatura("Historia"),
            new Asignatura("Física")
        };
    }

    // Constructor por defecto
    public Alumno() {
        this.nombreAlumno = "0";
        this.notas = new Asignatura[0];
    }

    // Constructor con nombre y array de asignaturas
    public Alumno(String nombreAlumno, Asignatura[] notas) {
        this.nombreAlumno = nombreAlumno;
        this.notas = notas;
    }

    // Getter and Setter
    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public Asignatura[] getNotas() {
        return notas;
    }

    public void setNotas(Asignatura[] notas) {
        this.notas = notas;
    }
}