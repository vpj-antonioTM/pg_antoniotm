/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajafuerte;

/**
 *
 * @author alumno
 */
public class Monedas {
    private int valor;
    private String material;
    private String pais;

    //Constructor por defecto
    public Monedas() {
                this.valor = 0;
        this.material = "0";
        this.pais = "0";
    }

    //Constructor parametrizado
    public Monedas(int valor, String material, String pais) {
        this.valor = valor;
        this.material = material;
        this.pais = pais;
    }
    
    //Getters and Stters
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }    
}
