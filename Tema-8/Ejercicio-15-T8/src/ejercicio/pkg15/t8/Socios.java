/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg15.t8;

/**
 *
 * @author antonio
 */
public class Socios {
    private String nombre;
    private float precioAbonado;
    
    public Socios(){
        nombre="";
        precioAbonado=0;
    }
    public Socios(String no,float pA){
        nombre=no;
        precioAbonado=pA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecioAbonado() {
        return precioAbonado;
    }

    public void setPrecioAbonado(float precioAbonado) {
        this.precioAbonado = precioAbonado;
    }

    @Override
    public String toString() {
        return "Socios{" + "nombre=" + nombre + ", precioAbonado=" + precioAbonado + '}';
    }
}
