package ejercicio.pkg22;

import java.util.Scanner;

public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double num1 = sc.nextDouble();
        System.out.println("Introduzca un numero");
        
        double num2 = sc.nextDouble();
        System.out.println("Introduzca un segundo numero");
        
        sc.close();
        
        resultado(num1, num2);
    }
    public static void resultado (double a, double  b){
       a = a * Math.PI;
       b = b * Math.E;
       System.out.println("El resultado del primer numeor es " + a);
       System.out.println("El resultado del segundo numero es " + b);
    }
}
