package ejercicio.pkg5.t6;

/**
 *
 * @author antonio
 */
public class Murcielago extends Mamifero implements Volador{
    private int vuelo;

    public Murcielago() {
        super();
        this.vuelo = 0;
    }

    public Murcielago(int vuelo, String nombre, String sexo, String color, int edad) {
        super(nombre, sexo, color, edad);
        this.vuelo = vuelo;
    }

    public int getVuelo() {
        return vuelo;
    }

    public void setVuelo(int vuelo) {
        this.vuelo = vuelo;
    }

    @Override
    public String toString() {
        return "Murcielago{" + "vuelo=" + vuelo + '}';
    }

    @Override
    public String obtenerMensajeVuelo() {
        return "El murcielago es un animal volador";
    }

    @Override
    public void aumentarAlturaVuelo() {
        vuelo += 5;
    }

    @Override
    public void bajarAlturaVuelo() {
        vuelo -= 5;
    }

    @Override
    public void mostrarAlturaVuelo() {
        System.out.println("La altura es de " + vuelo + " metros");
    }
}
