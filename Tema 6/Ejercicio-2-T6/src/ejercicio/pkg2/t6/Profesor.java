package ejercicio.pkg2.t6;

public class Profesor extends Persona {
    private String especialidad;

    public Profesor() {
        super();
        this.especialidad = "0";
    }

    public Profesor(String nombre, String especialidad) {
        super(nombre);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String saludar() {
        return "Hola, soy el profesor " + getNombre() + " y soy de la especialidad de " + especialidad;
    }
}
