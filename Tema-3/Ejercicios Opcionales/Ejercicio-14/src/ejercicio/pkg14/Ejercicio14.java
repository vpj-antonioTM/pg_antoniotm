package ejercicio.pkg14;
public class Ejercicio14 {

    /**
     * @author Antonio
     * Ejercicio-14
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo las variables num y contador, contador se encargara de contar los ciclos que hace el bucle
           int num = 2;
           int contador = 1;
           
           //Creo el bucle while y le pido a contador que no haga mas de 100 ciclos
           while (contador <= 100) {
               System.out.println(num);
               //Aqui le digo a la variable num que vaya sumando de 2 en 2 hasta que los ciclos del bucle terminen
               num +=2;
               //Aqui le pido a la variable contador que cada ciclo se añada un valor
               contador++;
           }
               
    }
    
}
