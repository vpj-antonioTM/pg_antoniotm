package ejercicio.pkg4.t6;

public class Test {

    public static void main(String[] args) {
        Canidos perro = new Canidos("Ladrad", "Carnivora", "Domestico", "Canis lupus familiaris", "Perro", 12, 10);
        Canidos lobo = new Canidos("aullido", "Carnivoro", "Bosque", "Canis lupus", "Lobo", 15, 100);
        Felino gato = new Felino("Maullido", "Ratones", "Domestico", "Felis silvestric catus", "Gato", 9, 23);
        Felino leon = new Felino("Rigudo", "Carnivora", "Sabana", "Panthera Leo", "Leon", 2, 250);

        System.out.println("\nPerro: \n");
        System.out.println(perro.toString());
        perro.nombreCientifico();
        perro.mostrarSonido();
        perro.habitat();
        perro.alimentacion();
 
        System.out.println("\nLobo: \n");        
        System.out.println(lobo.toString());
        lobo.nombreCientifico();
        lobo.mostrarSonido();
        lobo.habitat();
        lobo.alimentacion();
        
        System.out.println("\nGato: \n");
        System.out.println(gato.toString());
        gato.nombreCientifico();
        gato.mostrarSonido();
        gato.habitat();
        gato.alimentacion();
        
        System.out.println("\nLeon: \n");
        System.out.println(leon.toString());
        leon.nombreCientifico();
        leon.mostrarSonido();
        leon.habitat();
        leon.alimentacion();
        
    }
}
