package ejercicio.pkg4.t6;

public class Leon extends Felino{
        @Override
    public void mostrarSonido() {
        System.out.println("Sonido:  Rujido");
    }

    @Override
    public void mostrarAlimentacion() {
        System.out.println("Alimentacion: Carnivoro");
    }

    @Override
    public void mostrarHabitat() {
        System.out.println("Habitat: La sabana");
    }

    @Override
    public void mostrarNombreCientifico() {
        System.out.println("Nombre Cientifico: Panthera Leo");
    }

    @Override
    public String toString() {
        return super.toString() + " Leon ";
    } 
}
