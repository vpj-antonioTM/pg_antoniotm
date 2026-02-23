/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenarporseleccion;

/**
 *
 * @author alumno
 */
public class OrdenarPorSeleccion {

    /**
     * @param listaNumeros
     * @return 
     */
    public boolean ordenarPorSeleccion (int [] listaNumeros) {
        
        int temporal;                                                                                  //nodo1
        boolean listaOrdenada = true;
        
        for (int i = 0; i < listaNumeros.length -1 ; i++) {                      //nodo2
            for (int j = i + 1 ; j < listaNumeros.length ; j++) {               //nodo3
                if (listaNumeros[i] > listaNumeros[j]){                             //nodo4
                    temporal = listaNumeros[i];                                          
                    listaNumeros[i] = listaNumeros[j];                              
                    listaNumeros[j] = temporal;                                        
                    
                    listaOrdenada = false;                                                 //nodo5
                }
            }
        }
        return listaOrdenada;                                                               //nodo6
    }
}