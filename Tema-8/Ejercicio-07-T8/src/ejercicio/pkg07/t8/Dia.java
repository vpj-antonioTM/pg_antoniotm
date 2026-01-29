/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg07.t8;

/**
 *
 * @author alumno
 */
public class Dia {

    private String nombreDia;
    private int numeroDia;
    private int temperatura;

    public Dia() {
        this.nombreDia = "0";
        this.numeroDia = 0;
        this.temperatura = 0;
    }

    public Dia(String nombreDia, int numeroDia, int temperatura) {
        this.nombreDia = nombreDia;
        this.numeroDia = numeroDia;
        this.temperatura = temperatura;
    }

    public String getNombreDia() {
        return nombreDia;
    }

    public int getNumeroDia() {
        return numeroDia;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }
}
