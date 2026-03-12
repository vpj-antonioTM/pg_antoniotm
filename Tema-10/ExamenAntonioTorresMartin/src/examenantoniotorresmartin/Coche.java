/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenantoniotorresmartin;

/**
 *
 * @author alumno
 */
public class Coche {

    String nombreTitular;
    String matriculaCoche;

    //Constructor por defecto
    public Coche() {
        this.nombreTitular = "0";
        this.matriculaCoche = "0";
    }

    //Constructor con Parametros
    public Coche(String nombreTitular, String matriculaCoche) {
        this.nombreTitular = nombreTitular;
        this.matriculaCoche = matriculaCoche;
    }
    
    //Getters y Setters
    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public String getMatriculaCoche() {
        return matriculaCoche;
    }

    public void setMatriculaCoche(String matriculaCoche) {
        this.matriculaCoche = matriculaCoche;
    }
    
    //To String
    @Override
    public String toString() {
        return nombreTitular + " - " + matriculaCoche;
    }
}
