/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej16;

/**
 *
 * @author alumno
 */
public class Producto {

    private String nombre;
    private float precio;
    private int stock;

    //Constructor por Defecto
    public Producto() {
        this.nombre = "0";
        this.precio = 0;
        this.stock = 0;
    }

    //Constructor Parametrizado
    public Producto(String nombre, float precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //To String
    @Override
    public String toString() {
        return nombre + " - " + precio + " - " + stock;
    }
}