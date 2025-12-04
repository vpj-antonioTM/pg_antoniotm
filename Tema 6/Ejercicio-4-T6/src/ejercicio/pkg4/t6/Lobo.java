package ejercicio.pkg4.t6;

public class Lobo extends Canido{
        @Override
    public void mostrarSonido() {
        System.out.println("Sonido:  Aullido");
    }

    @Override
    public void mostrarAlimentacion() {
        System.out.println("Alimentacion: Carnivora");
    }

    @Override
    public void mostrarHabitat() {
        System.out.println("Habitat: El bosque");
    }

    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Nombre Cientifico: Canis Lupus");
    }

    @Override
    public String toString() {
        return super.toString() + " Lobo ";
    } 
}
