/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg11.t7;

/**
 *
 * @author alumno
 */
public class Ejercicio11T7 {

    public static void main(String[] args) {
        int[] vector = new int[10];
       
        //Llenamos el array sin repetir
        rellenarSinRepetir(vector);
       
        //Mostramos el array
        mostrarArray(vector);
    }
   
    //Metodo que rellena el array con numeros aleatorios del 0 al 9 sin repetir
    public static void rellenarSinRepetir(int[]vector){
       
        for (int i = 0; i < vector.length; i++){
            int numAleatorio;//Guarda el numero aleatorio
            boolean repetido;//Nos dice si ese numero ya apareció en el array
           
            do{
                //Genera un número entreo 0 y 9
                numAleatorio =(int)(Math.random() * 10);
                repetido = false;
               
                //Comprobamos si ya existe
                for (int j = 0 ; j < i ;j++){//Compara las posiciones
                    if (vector[j] == numAleatorio){
                        repetido = true;
                    }
                }
            } while (repetido);
           vector[i] = numAleatorio;  
        }
    }
   
   
    //Metodo para mostrar el array
    public static void mostrarArray(int[] vector){
        System.out.println("Se ha generado el siguiente array");
       
        for(int i = 0; i < vector.length ; i++){
            System.out.print(vector[i] + "");
        }
    }
}
