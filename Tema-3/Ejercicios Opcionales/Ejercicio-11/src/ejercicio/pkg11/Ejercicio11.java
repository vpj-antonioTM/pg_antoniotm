package ejercicio.pkg11;
public class Ejercicio11 {

    /**
     * @author Antonio
     * Ejercicio-11
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           //Creo un bucle for y le pido que la variable i tenga el valor 1 y esta vaya sumandose 1 hasta que sea igual o menos que 6
           for (int i = 1; i <= 6;  i++){
           System.out.print("Hola" + i);
           //Aqui hago una estructura if para que a cada hola se le ponga un guion de separacion entre ellos
                if (i < 6){
                System.out.print(" - ");
                }
                
           }

    }
    
}
