/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg11.t8;

/**
 *
 * @author alumno
 */
public class Mueble {

    // Atributos
    private double precio;
    private String descripcion;

    // Constructor por defecto
    public Mueble() {
        this.precio = 0;
        this.descripcion = "0";
    }

    // Constructor parametrizado
    public Mueble(double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    // Getters
    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    // Setters
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Metodo para mostrar informacion
    public void mostrarInfo() {
        System.out.println("Descripción: " + descripcion);
        System.out.println("Precio: " + precio + " €");
        System.out.println("---------------------------");
    }

    // Main de prueba
    public static void main(String[] args) {

        // Objeto creado con constructor por defecto
        Mueble m1 = new Mueble();

        // Objeto creado con constructor parametrizado
        Mueble m2 = new Mueble(199.99, "Silla ergonómica de oficina");

        // Mostrar información inicial
        System.out.println("Información inicial:");
        m1.mostrarInfo();
        m2.mostrarInfo();

        // Cambiar descripciones usando setters
        m1.setDescripcion("Mesa de madera maciza");
        m2.setDescripcion("Silla ergonómica premium con reposabrazos");

        // Cambiar precio también (opcional)
        m1.setPrecio(349.50);

        // Mostrar información actualizada
        System.out.println("Información actualizada:");
        m1.mostrarInfo();
        m2.mostrarInfo();
    }
}

