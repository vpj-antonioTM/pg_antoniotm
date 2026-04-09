package ej8_t11;

public class Sede {

    private String nombre;
    private double ingresos;

    public Sede(String nombre, double ingresos) {
        this.nombre = nombre;
        this.ingresos = ingresos;
    }

    public String getNombre() {
        return nombre;
    }

    public double getIngresos() {
        return ingresos;
    }

    @Override
    public String toString() {
        return "Sede: " + nombre + ", Ingresos: " + ingresos;
    }
}