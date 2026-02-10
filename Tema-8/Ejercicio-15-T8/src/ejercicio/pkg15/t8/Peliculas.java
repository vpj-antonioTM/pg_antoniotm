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
    private double costeLicencia;

    // Array de socios que han asistido (aforo 4)
    private Socios[] socios;

    // Constructor principal
    public Peliculas(String titulo, double costeLicencia) {
        this.titulo = titulo;
        this.costeLicencia = costeLicencia;

        // Creamos el array de 4 socios
        this.socios = new Socios[4];
    }

    // Getter and Setter
    public String getTitulo() {
        return titulo;
    }

    public double getCosteLicencia() {
        return costeLicencia;
    }

    public Socios[] getSocios() {
        return socios;
    }

    public void setSocio(int index, Socios socio) {
        this.socios[index] = socio;
    }
}