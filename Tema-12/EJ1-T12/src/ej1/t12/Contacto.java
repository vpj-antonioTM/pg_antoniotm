package ej1.t12;

/**
 * Clase que representa un contacto de la agenda.
 */
public class Contacto {
    private String nombre;
    private int edad;
    private String telefono;

    public Contacto(String nombre, int edad, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public String getTelefono() { return telefono; }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | Edad: " + edad + " | Teléfono: " + telefono;
    }
}