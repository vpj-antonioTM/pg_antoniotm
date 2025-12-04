package ejercicio.pkg4.t6;

public class Test {
    public static void main(String[] args) {
        Perro perroA = new Perro();
        perroA.setNombre("Firulais");
        perroA.setEdad(5);
        perroA.setPeso(12.5);
        
        Lobo loboA = new Lobo();
        loboA.setNombre("Jacky");
        loboA.setEdad(7);
        loboA.setPeso(38);
        
        Gato gatoA = new Gato();
        gatoA.setNombre("Mia");
        gatoA.setEdad(3);
        gatoA.setPeso(6);
        
        Leon leonA = new Leon();
        leonA.setNombre("Shadow");
        leonA.setEdad(1);
        leonA.setPeso(25);
        
        System.out.println("\n");
        
        System.out.println(perroA);
        System.out.println(loboA);
        System.out.println(gatoA);
        System.out.println(leonA);

                System.out.println("\n");
        
        System.out.println(perroA);
        perroA.mostrarSonido();
        perroA.mostrarAlimentacion();
        perroA.mostrarHabitat();
        perroA.mostrarNombreCientifico();
        System.out.println();

        System.out.println(loboA);
        loboA.mostrarSonido();
        loboA.mostrarAlimentacion();
        loboA.mostrarHabitat();
        loboA.mostrarNombreCientifico();
        System.out.println();

        System.out.println(leonA);
        leonA.mostrarSonido();
        leonA.mostrarAlimentacion();
        leonA.mostrarHabitat();
        leonA.mostrarNombreCientifico();
        System.out.println();

        System.out.println(gatoA);
        gatoA.mostrarSonido();
        gatoA.mostrarAlimentacion();
        gatoA.mostrarHabitat();
        gatoA.mostrarNombreCientifico();
        System.out.println();
     }
}
