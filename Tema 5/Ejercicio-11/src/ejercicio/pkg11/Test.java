
package ejercicio.pkg11;

import java.util.Scanner;

class Numero {

    private int valor;
    
    //Creo contructor por defecto
    public Numero() {
        this.valor = 0;
    }
    
    //Creo el getter
    public int getValor() {
        return valor;
    }
    
    //Creo el setter
    public void setValor(int valor){
        this.valor = valor;
    }
}

//Creo la clase Test

public class Test {
    //Creo el metodo para pedirle los numeros al ususario
    static void pedirNumeros (Numero num1, Numero num2) {
        Scanner entrada = new Scanner (System.in);
        
        //Le pido los 2 nmeros al usuario
        System.out.println("Por favor introduzca un numero: ");
        num1.setValor(entrada.nextInt());
        
        System.out.println("Por favor introduzca un segundo numero: ");
        num2.setValor(entrada.nextInt());
    }
    
    //Creo el metodo de suma
    static int sumar (Numero num1, Numero num2) {
        return num1.getValor() + num2.getValor();
    }
    
    //Creo el metodo multiplicar
    static int multiplicar (Numero num1, Numero num2) {
        return num1.getValor() * num2.getValor();
    }
    
    //Creo el metodo donde muestro los resultados
    public static void main(String[] args) {
        Numero n1 = new Numero();
        Numero n2 = new Numero();
        
        //Llamamos al metodo pedirNumeros
        pedirNumeros(n1,n2);
        
        //Creamos la suma y multiplicacion con un if else, esoto nos mostrara tambien el resultado
        if(n1.getValor() > 10){
            int resultado = multiplicar(n1,n2);
            System.out.println("Se ha realizado una multiplicacion " 
                    + n1.getValor() + " * " 
                    + n2.getValor() + " = " 
                    + resultado);
        }
        else {
            int resultado = sumar(n1,n2);
            System.out.println("Se ha realizado una suma " 
                    + n1.getValor() + " + " 
                    + n2.getValor() + " = " 
                    + resultado);
        }
    }
    
}
