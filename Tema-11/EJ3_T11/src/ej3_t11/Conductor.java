package ej3_t11;

public class Conductor {

    private final String dni;
    private final String nombre;

    public Conductor(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "DNI: " + dni + ", Nombre: " + nombre;
    }
}