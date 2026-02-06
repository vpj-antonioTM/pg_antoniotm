/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg12.t8;

/**
 *
 * @author alumno
 */
public class Mueble {

    private double precio;
    private String descripcion;

    public Mueble() {
        this.precio = 0;
        this.descripcion = "0";
    }

    public Mueble(double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void mostrarInfo() {
        System.out.println("Descripción: " + descripcion);
        System.out.println("Precio: " + precio + " €");
        System.out.println("---------------------------");
    }
}