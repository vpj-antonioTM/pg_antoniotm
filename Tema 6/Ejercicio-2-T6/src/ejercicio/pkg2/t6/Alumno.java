package ejercicio.pkg2.t6;

public class Alumno extends Persona{
    
    private String grupo;

    public Alumno() {
        super();
        this.grupo = "0";
    }

    public Alumno(String nombre, String grupo) {
        super(nombre);
        this.grupo = grupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
    @Override
    public String saludar() {
        return "Hola, soy el Alumno " + getNombre() + " y soy de la especialidad de " + grupo;
    }
    
    
}
