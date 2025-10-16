package ejercicio.pkg16;
public class Ejercicio16 {

    /**
     * @author Antonio
     * Ejercicio-16
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo las variables que voy a utilizar, numero para que me cuente del 20 al 160, y i para asignarle funciones en el bucle for
        int numero = 0;
        int i;
        
        //Hago la primera impresion en pantalla que muestra la informacion que se pide
        System.out.println("Los numeros impares existentes entre el numero 20 y el 160: ");
        
        //Creo el bucle for, le digo que empieze en el numero 21 y que termine en el 160 y que cada vez que de una vuelta sume uno a i
        for ( i = 21; i < 160; i++) {
            
        //creo un bucle if donde le pido que coja el resto la division de i/2 y si el resultado es 1 es correcto, asi solo coge los numeros impares
            if (i % 2 == 1) {
                System.out.print(i + " - ");
                
                //Aqui le pido a numero que cada vez que de una vuelta me sume uno, esto lo hago para que me cuente las vueltas del bucle
                numero++;
            }
        }
        //Aqui solo pido que me imprima debajo el resultado de las vueltas que ha hecho el bucle
        System.out.println("\n La cantidad de numeros impares hasn sido: " + numero);
    }
    
}
