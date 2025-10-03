package ejercicio.pkg16;
public class Ejercicio16 {

    /**
     * @author Antonio
     * Ejercicio-16
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Añado la variable de cantidad de dinero
        int dinero = 130;
        
        //Añado una variable para que me divida el dinero en billetes de 50
        int billetes50 = dinero / 50;
        
        //Añado otra variable para que me calcule el resto del calculo anterior
        int resto = dinero % 50;
        
        //Añado una ultima variable para que me calcule el resto del dinero en billetes de 10
        int billetes10 = resto / 10;
        
        System.out.println("130 euros hacen un total de: " + billetes50 + " billetes de 50 euros y " + billetes10 + " billetes de 10 euros.");
    }
    
}
