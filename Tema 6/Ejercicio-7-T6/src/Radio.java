/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author antonio
 */
public class Radio implements controlRemoto {

    private boolean encendido;
    private float emisora;
    private int volumen;

    public Radio() {
        this.encendido = false;
        this.emisora = 80.0f;
        this.volumen = 15;
    }

    public Radio(boolean encendido, float emisora, int volumen) {
        this.encendido = encendido;
        this.emisora = emisora;
        this.volumen = volumen;
    }

    public float getEmisora() {
        return emisora;
    }

    public void setEmisora(float emisora) {
        this.emisora = emisora;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void mostrarInfo() {
        System.out.println("Radio [Encendido: " + encendido
                + ", Emisora: " + emisora
                + ", Volumen: " + volumen + "]");
    }

    @Override
    public void apagar() {
        if (encendido == true) {
            encendido = false;
        }
    }

    @Override
    public void encender() {
        if (encendido == false) {
            encendido = true;
        }
    }

    @Override
    public void bajarVolumen() {
        if (encendido == true) {
            volumen -= 5;
        }
    }

    @Override
    public void subirVolumen() {
        if (encendido == true) {
            volumen += 5;
        }
    }

    @Override
    public void cambiarCanal(float canal) {
        if (encendido == true) {
            this.emisora = emisora;
        }
    }

}
