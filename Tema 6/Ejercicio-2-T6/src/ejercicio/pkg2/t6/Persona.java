package ejercicio.pkg2.t6;

public abstract class Persona {
     private String nombre;

    public Persona() {
        this.nombre = "0";
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract String saludar();
}
