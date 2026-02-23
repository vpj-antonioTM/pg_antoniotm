/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenacionburbuja;

/**
 *
 * @author alumno
 */
public class OrdenacionBurbuja {

    /**
     * @param args the command line arguments
     */
    public boolean burbuja(int[] arrayNumeros) {  
        
        boolean ordenado = true;                                                //NODO1   
        int elementoActual, elementoSiguiente;      

        for (int x = 0; x < arrayNumeros.length; x++) {                         //NODO2
            for (int y = 0; y < arrayNumeros.length - 1; y++) {                 //NODO3
                elementoActual = arrayNumeros[y];                               //NODO4
                elementoSiguiente = arrayNumeros[y + 1];    

                if (elementoActual > elementoSiguiente) {                       //NODO5
                    arrayNumeros[y] = elementoSiguiente;                        
                    arrayNumeros[y + 1] = elementoActual;   
                    ordenado = false;                                           
                }
            }
        }

        return ordenado;                                                        //NODO6
    }      
    
}
