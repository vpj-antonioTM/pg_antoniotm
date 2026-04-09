package ej3_t11;

import java.util.HashMap;

public class Autobus {

    private final String matricula;
    private final HashMap<String, Conductor> conductores;

    public Autobus(String matricula) {
        this.matricula = matricula;
        this.conductores = new HashMap<>();
    }

    public String getMatricula() {
        return matricula;
    }

    public HashMap<String, Conductor> getConductores() {
        return conductores;
    }

    public void addConductor(Conductor c) {
        conductores.put(c.getDni(), c);
    }

    @Override
    public String toString() {
        String info = "Matricula: " + matricula + "\nConductores:\n";
        for (Conductor c : conductores.values()) {
            info += "   - " + c + "\n";
        }
        return info;
    }
}