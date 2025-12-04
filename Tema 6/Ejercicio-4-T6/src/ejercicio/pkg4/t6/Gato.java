package ejercicio.pkg4.t6;

public class Gato extends Felino{

    @Override
    public void mostrarSonido() {
        System.out.println("Sonido:  Maullido");
    }

    @Override
    public void mostrarAlimentacion() {
        System.out.println("Alimentacion: Ratones");
    }

    @Override
    public void mostrarHabitat() {
        System.out.println("Habitat: Domestico");
    }

    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Nombre Cientifico: Felis Silvestris Catus");
    }

    @Override
    public String toString() {
        return super.toString() + " Gato ";
    } 
}
