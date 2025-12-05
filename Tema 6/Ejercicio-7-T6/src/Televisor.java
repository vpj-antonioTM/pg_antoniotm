/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author antonio
 */
public class Televisor implements controlRemoto {

    private boolean encendido;
    private float canal;
    private int volumen;

    public Televisor() {
        this.encendido = false;
        this.canal = 0;
        this.volumen = 0;
    }

    public Televisor(boolean encendido, int canal, int volumen) {
        this.encendido = encendido;
        this.canal = canal;
        this.volumen = volumen;
    }

    public float getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void mostrarInfo() {
        System.out.println("Televisor [Encendido: " + encendido
                + ", Canal: " + canal
                + ", Volumen: " + volumen + "]");
    }

    @Override
    public void apagar() {
        if (encendido == true) {
            System.out.println("La TV se apagara en 10 segundos");
        } else {
            System.out.println("La TV esta encendida");
        }
    }

    @Override
    public void encender() {
        if (encendido == false) {
            encendido = true;
            System.out.println(canal);
        } else {
            System.out.println("La TV ya esta enecendida");
        }
    }

    @Override
    public void bajarVolumen() {
        if (encendido == true) {
            volumen--;
            System.out.println("El volumen es " + volumen);
        } else {
            System.out.println("La TV esta apagada");
        }
    }

    @Override
    public void subirVolumen() {
        if (encendido == true) {
            volumen++;
            System.out.println("El volumen es " + volumen);
        } else {
            System.out.println("La TV esta apagada");
        }
    }

    @Override
    public void cambiarCanal(float canal) {
        if (encendido) {
            this.canal = canal;
            System.out.println(this.canal);
        }
    }

}
