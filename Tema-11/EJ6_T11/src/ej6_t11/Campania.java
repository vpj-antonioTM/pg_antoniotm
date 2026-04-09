package ej6_t11;

public class Campania {

    private String nombre;
    private Donacion[] donaciones;
    private int contador;

    public Campania(String nombre) {
        this.nombre = nombre;
        this.donaciones = new Donacion[100];
        this.contador = 0;
    }

    // Insercion ordenada de mayor a menor
    public void addDonacion(Donacion d) {
        if (contador == donaciones.length) {
            System.out.println("No se pueden anadir mas donaciones.");
            return;
        }

        int i = contador - 1;

        while (i >= 0 && donaciones[i].getCantidad() < d.getCantidad()) {
            donaciones[i + 1] = donaciones[i];
            i--;
        }

        donaciones[i + 1] = d;
        contador++;
    }

    public void mostrarDonaciones() {
        if (contador == 0) {
            System.out.println("No hay donaciones.");
            return;
        }

        for (int i = 0; i < contador; i++) {
            System.out.println(donaciones[i]);
        }
    }

    public void mostrarPorNombre(String nombre) {
        boolean encontrado = false;

        for (int i = 0; i < contador; i++) {
            if (donaciones[i].getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(donaciones[i]);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay donaciones de ese nombre.");
        }
    }

    public int getNumeroDonaciones() {
        return contador;
    }

    public double getTotalRecaudado() {
        double total = 0;
        for (int i = 0; i < contador; i++) {
            total += donaciones[i].getCantidad();
        }
        return total;
    }
}