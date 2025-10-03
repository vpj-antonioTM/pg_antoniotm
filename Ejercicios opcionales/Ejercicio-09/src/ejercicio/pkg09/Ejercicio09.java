package ejercicio.pkg09;

    /**
     * @author Antonio
     * Ejercicio-09
     * @param args the command line arguments
     */

public class Ejercicio09 {
    
    //Aqui llamo a la constante fuera del main, dentro de la clase.
    final static double PI = 3.141592;
    
    public static void main(String[] args) {
        // Asigno nombre a los valores que voy a utiulizar.
        double radio, metros, resultado;
        
        //Aqui asigno a los valores las cantidades que me indica el ejercicio.
        radio = 3.55;
        metros = 3;
        
        //En el resultado asigno un valor y con el /PI llamo a la constante para calcular el radio.
        resultado = radio/PI;
        System.out.println("El radio es igual a " + resultado);
        
        resultado = metros/PI;
        System.out.println("Los metros es igual a " + resultado);
    }
    
}
