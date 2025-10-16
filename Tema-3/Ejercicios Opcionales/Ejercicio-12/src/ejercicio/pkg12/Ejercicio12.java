package ejercicio.pkg12;
public class Ejercicio12 {

    /**
     * @author Antonio
     * Ejercicio-12
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo una variable num que tenga el valor 11
           int num =11;
           
           //Creo un bucle do while que coja la variable num y la divida entre para coger el resto y saber si es par o impar
           do {
               if (num % 2 == 0){
               //Aqui pido que si cumple el requisito de que sea igual a 0 me lo imprima
               System.out.println(num);
               }
          //Cuando se cumple el bucle do viene aqui y se añade un valor mas a num y si no cumple vuelve a repetir el proceso
           num++;
           
           //Hasta que no supere o se iguale la cantidad que siga repitiendose el bucle
           } while (num <= 133);
           
    }
    
}
