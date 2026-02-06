/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg15.t8;

/**
 *
 * @author antonio
 */
public class Peliculas {
    private String titulo;
    private float costeLicencia;
    private Socios[] sociosPelis;
    
    public Peliculas(){
        titulo="";
        costeLicencia=10;
        sociosPelis=new Socios[4];
    }
    
    public Peliculas(String ti,float co,int cantidad){
        titulo="";
        costeLicencia=10;
        sociosPelis=new Socios[cantidad];
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getCosteLicencia() {
        return costeLicencia;
    }

    public void setCosteLicencia(float costeLicencia) {
        this.costeLicencia = costeLicencia;
    }

    public Socios[] getSociosPelis() {
        return sociosPelis;
    }

    public void setSociosPelis(Socios[] sociosPelis) {
        this.sociosPelis = sociosPelis;
    }
    
    public String getNombreSocios(int numero) {
        return sociosPelis[numero].getNombre();
    }
    
    public void setNombreSocios(int numero,String nombre) {
        sociosPelis[numero].setNombre(nombre);
    }
    public float getprecioSocios(int numero) {
        return sociosPelis[numero].getPrecioAbonado();
    }
    
    public void setprecioSocios(int numero,float precio) {
        sociosPelis[numero].setPrecioAbonado(precio);
    }
    public void mostrar(){
        System.out.println(toString());
        for (int i = 0; i < sociosPelis.length; i++) {
            System.out.println(sociosPelis[i].toString());
        }
    }
    @Override
    public String toString() {
        return "Peliculas{" + "titulo=" + titulo + ", costeLicencia=" + costeLicencia + ", sociosPelis=" + sociosPelis +'}';
        
    }

}
