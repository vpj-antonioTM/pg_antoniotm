package ej8_t11;

import java.util.HashSet;

public class Ciudad {

    private String nombre;
    private HashSet<Sede> sedes;

    public Ciudad(String nombre) {
        this.nombre = nombre;
        this.sedes = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public HashSet<Sede> getSedes() {
        return sedes;
    }

    public void addSede(Sede s) {
        sedes.add(s);
    }

    @Override
    public String toString() {
        String info = "Ciudad: " + nombre + "\nSedes:\n";
        for (Sede s : sedes) {
            info += "   - " + s + "\n";
        }
        return info;
    }
}