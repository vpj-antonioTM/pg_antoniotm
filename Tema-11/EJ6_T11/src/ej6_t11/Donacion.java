package ej6_t11;

public class Donacion {

    private String nombre;
    private double cantidad;

    public Donacion(String nombre, double cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Donante: " + nombre + ", Cantidad: " + cantidad;
    }
}