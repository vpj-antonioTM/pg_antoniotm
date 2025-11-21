
package ejercico.pkg12;

//Clase Triangulo

import java.util.Scanner;

class Triangulo {

    private double cateto1;
    private double cateto2;
    
    //Constructor que almacena catetos
    public Triangulo(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }
    
    //Metodo para calcular la hipotenusa
    public double calculaHipotenusa() {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }
    
    //Metodo mostrar resultados
    public void resultados (){
        System.out.println("Cateto 1 " + cateto1);
        System.out.println("Cateto 2 " + cateto2);
        System.out.println("Hipotenusa " + calculaHipotenusa());
    }
}
    public class Test {
        public static void main (String[] args) {
            Scanner entrada = new Scanner (System.in);
            
            System.out.println("Por favor introduzca un numero: ");
            double c1 = entrada.nextDouble();
            
            System.out.println("Por favor introduzca un segundo numero: ");
            double c2 = entrada.nextDouble();
            
            //Creo el objeto triangulo con los catetos
            Triangulo t = new Triangulo(c1, c2);
                    
            //Llamamos a resultaados
            t.resultados();
        }
    }


