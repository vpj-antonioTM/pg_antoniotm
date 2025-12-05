package ejercicio.pkg5.t6;

/**
 *
 * @author antonio
 */
public class Ornitorrinco extends Mamifero implements Oviparo{
    private int huevos;

    public Ornitorrinco() {
        super();
        this.huevos = 0;
    }

    public Ornitorrinco(int huevos, String nombre, String sexo, String color, int edad) {
        super(nombre, sexo, color, edad);
        this.huevos = huevos;
    }

    public int getHuevos() {
        return huevos;
    }

    public void setHuevos(int huevos) {
        this.huevos = huevos;
    }

    @Override
    public String toString() {
        return "Ornitorrinco{" + "huevos=" + huevos + '}';
    }

    @Override
    public String obtenerMensajeOviparo() {
        return "El ornitorrinco es un mamifero oviparo";
    }

    @Override
    public void ponerHuevo() {
        huevos += 1;
    }

    @Override
    public void incubarHuevo() {
        huevos -= 1;
    }

    @Override
    public void mostrarNumHuevos() {
        System.out.println("El ornitorrinco tiene " + huevos + " de cantidad de huevos");
    }
}
