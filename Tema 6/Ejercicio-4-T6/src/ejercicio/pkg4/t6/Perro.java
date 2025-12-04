package ejercicio.pkg4.t6;

public class Perro extends Canido{

    @Override
    public void mostrarSonido() {
        System.out.println("Sonido:  Ladrido");
    }

    @Override
    public void mostrarAlimentacion() {
        System.out.println("Alimentacion: Carnivora");
    }

    @Override
    public void mostrarHabitat() {
        System.out.println("Habitat: Domestico");
    }

    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Nombre Cientifico: Canis Lupus Familiaris");
    }

    @Override
    public String toString() {
        return super.toString() + " Perro ";
    } 
}
