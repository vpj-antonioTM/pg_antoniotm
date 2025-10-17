package ejercicio.pkg28;
public class Ejercicio28 {

    /**
     * @author Antonio
     * Ejercicio-28
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           // Aqui creo la variable aleatorio y uso Math.random para que me de un numero aleatorio
           int aleatorio = (int) (Math.random() * 100);
           
           //Creo un if y un else, el if me comprueba si el numero es par, y el else lo que hace que si el numero no es valido en if se va a else
           if (aleatorio % 2 == 0){
               System.out.println("El numero " + aleatorio + " es par.");
           }
           else {
               System.out.println("El numero " + aleatorio + " es impar");
           }
      }
}
