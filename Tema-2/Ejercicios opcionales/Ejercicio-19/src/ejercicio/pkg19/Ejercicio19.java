package ejercicio.pkg19;
public class Ejercicio19 {

    /**
     * @author Antonio
     * Ejercicio-19
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 3, b = 6, c;
        
        //Aqui se esta dividiendo 3 / 6 = 0
        c = a / b;
        System.out.println("El valor c es: " + c + "\n");
        
        //Aqui sale el resto de 3 / 6 = 3
        c = a % b;
        System.out.println("El valor c es: " + c + "\n");
        
        // Aqui le estas añadiendo al valor de a que se sume 1 y da 4
        a++;
        System.out.println("El valor a es: " + a + "\n");
        
        //Aqui se esta añadiendo +1 del añadido antes el resultado es 5
        ++a;
        System.out.println("El valor a es: " + a + "\n");
        
        //Aqui se añade +1 a la variable a = 6 y a la variable b = 7 y c 
        c = ++a + b++;
        System.out.println("El valor a es: " + a);
        System.out.println("El valor b es: " + b);
        System.out.println("El valor c es: " + c + "\n");
        
        
        c= ++a + ++b;
        System.out.println("El valor a es: " + a);
        System.out.println("El valor b es: " + b);
        System.out.println("El valor c es: " + c);
        
    }
    
}
