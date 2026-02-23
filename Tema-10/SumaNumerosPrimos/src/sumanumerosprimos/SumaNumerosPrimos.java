/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumanumerosprimos;

/**
 *
 * @author Juan
 */
public class SumaNumerosPrimos {

    public static int sumaPrimos(int numeroMaximo) {

        int acumulador = 0;                                                     //NODO 1
        int numero = 2;
        int contador;
        boolean primo;

        while (numero <= numeroMaximo) {                                        //NODO2

            contador = 2;
            primo = true;

            while (primo && contador != numero) {                               //NODO3

                if (numero % contador == 0) {                                   //NODO4
                    primo = false;                                              //NODO5
                }

                contador++;                                                     //NODO6
            }

            if (primo) {                                                        //NODO7
                acumulador = acumulador + numero;                               //NODO8
            }

            numero++;                                                           //NODO9
        }

        return acumulador;                                                      //NODO10
    }
}
